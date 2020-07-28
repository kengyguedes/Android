package com.kengy.projetomaxima.database;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.kengy.projetomaxima.database.entity.ClienteWithContatos;
import com.kengy.projetomaxima.database.entity.EntityCliente;
import com.kengy.projetomaxima.database.entity.EntityContato;
import com.kengy.projetomaxima.database.entity.EntityLegendaPedido;
import com.kengy.projetomaxima.database.entity.EntityPedido;
import com.kengy.projetomaxima.database.entity.PedidoWithLegends;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PedidoDao_Impl implements PedidoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<EntityPedido> __insertionAdapterOfEntityPedido;

  private final EntityInsertionAdapter<EntityLegendaPedido> __insertionAdapterOfEntityLegendaPedido;

  private final EntityInsertionAdapter<EntityCliente> __insertionAdapterOfEntityCliente;

  private final EntityInsertionAdapter<EntityContato> __insertionAdapterOfEntityContato;

  public PedidoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEntityPedido = new EntityInsertionAdapter<EntityPedido>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `mxspedidos` (`numpedrca`,`numpederp`,`codcli`,`nomecliente`,`data`,`status`,`critica`,`tipo`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EntityPedido value) {
        stmt.bindLong(1, value.getNumero_ped_Rca());
        if (value.getNumero_ped_erp() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNumero_ped_erp());
        }
        if (value.getCodigoCliente() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCodigoCliente());
        }
        if (value.getNOMECLIENTE() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNOMECLIENTE());
        }
        if (value.getData() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getData());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getStatus());
        }
        if (value.getCritica() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCritica());
        }
        if (value.getTipo() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getTipo());
        }
      }
    };
    this.__insertionAdapterOfEntityLegendaPedido = new EntityInsertionAdapter<EntityLegendaPedido>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `legendas` (`idlegend`,`legenda`,`pedidocreatorid`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EntityLegendaPedido value) {
        stmt.bindLong(1, value.getIdLegend());
        if (value.getLegenda() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLegenda());
        }
        stmt.bindLong(3, value.getPedidoCreatorId());
      }
    };
    this.__insertionAdapterOfEntityCliente = new EntityInsertionAdapter<EntityCliente>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `mxscliente` (`idCliente`,`codcli`,`razaosocial`,`nomefantasia`,`cgcent`,`ramoatividade`,`endereco`,`status`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EntityCliente value) {
        stmt.bindLong(1, value.getId());
        if (value.getCodigo() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCodigo());
        }
        if (value.getRazao_social() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRazao_social());
        }
        if (value.getNomeFantasia() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNomeFantasia());
        }
        if (value.getCnpj() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCnpj());
        }
        if (value.getRamo_atividade() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getRamo_atividade());
        }
        if (value.getEndereco() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getEndereco());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getStatus());
        }
      }
    };
    this.__insertionAdapterOfEntityContato = new EntityInsertionAdapter<EntityContato>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `mxscontato` (`userCreatorId`,`nome`,`telefone`,`celular`,`conjugue`,`tipo`,`time`,`email`,`datanascimento`,`datanascimentoconjugue`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EntityContato value) {
        stmt.bindLong(1, value.getUserCreatorId());
        if (value.getNome() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNome());
        }
        if (value.getTelefone() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTelefone());
        }
        if (value.getCelular() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCelular());
        }
        if (value.getConjuge() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getConjuge());
        }
        if (value.getTipo() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTipo());
        }
        if (value.getTime() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTime());
        }
        if (value.getE_mail() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getE_mail());
        }
        if (value.getData_nascimento() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getData_nascimento());
        }
        if (value.getDataNascimentoConjuge() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getDataNascimentoConjuge());
        }
      }
    };
  }

  @Override
  public void gravaPedidosBanco(final List<EntityPedido> lstPedidos) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfEntityPedido.insert(lstPedidos);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void gravaPedidosBanco1(final EntityPedido pedido,
      final List<EntityLegendaPedido> legendas) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfEntityPedido.insert(pedido);
      __insertionAdapterOfEntityLegendaPedido.insert(legendas);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void gravaClientesBanco(final EntityCliente cliente, final List<EntityContato> contatos) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfEntityCliente.insert(cliente);
      __insertionAdapterOfEntityContato.insert(contatos);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<EntityPedido> getPedidos() {
    final String _sql = "select * from mxspedidos";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfNumeroPedRca = CursorUtil.getColumnIndexOrThrow(_cursor, "numpedrca");
      final int _cursorIndexOfNumeroPedErp = CursorUtil.getColumnIndexOrThrow(_cursor, "numpederp");
      final int _cursorIndexOfCodigoCliente = CursorUtil.getColumnIndexOrThrow(_cursor, "codcli");
      final int _cursorIndexOfNOMECLIENTE = CursorUtil.getColumnIndexOrThrow(_cursor, "nomecliente");
      final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfCritica = CursorUtil.getColumnIndexOrThrow(_cursor, "critica");
      final int _cursorIndexOfTipo = CursorUtil.getColumnIndexOrThrow(_cursor, "tipo");
      final List<EntityPedido> _result = new ArrayList<EntityPedido>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final EntityPedido _item;
        final int _tmpNumero_ped_Rca;
        _tmpNumero_ped_Rca = _cursor.getInt(_cursorIndexOfNumeroPedRca);
        final String _tmpNumero_ped_erp;
        _tmpNumero_ped_erp = _cursor.getString(_cursorIndexOfNumeroPedErp);
        final String _tmpCodigoCliente;
        _tmpCodigoCliente = _cursor.getString(_cursorIndexOfCodigoCliente);
        final String _tmpNOMECLIENTE;
        _tmpNOMECLIENTE = _cursor.getString(_cursorIndexOfNOMECLIENTE);
        final String _tmpData;
        _tmpData = _cursor.getString(_cursorIndexOfData);
        final String _tmpStatus;
        _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        final String _tmpCritica;
        _tmpCritica = _cursor.getString(_cursorIndexOfCritica);
        final String _tmpTipo;
        _tmpTipo = _cursor.getString(_cursorIndexOfTipo);
        _item = new EntityPedido(_tmpNumero_ped_Rca,_tmpNumero_ped_erp,_tmpCodigoCliente,_tmpNOMECLIENTE,_tmpData,_tmpStatus,_tmpCritica,_tmpTipo);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<EntityCliente> getClientes() {
    final String _sql = "select * from mxscliente";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "idCliente");
      final int _cursorIndexOfCodigo = CursorUtil.getColumnIndexOrThrow(_cursor, "codcli");
      final int _cursorIndexOfRazaoSocial = CursorUtil.getColumnIndexOrThrow(_cursor, "razaosocial");
      final int _cursorIndexOfNomeFantasia = CursorUtil.getColumnIndexOrThrow(_cursor, "nomefantasia");
      final int _cursorIndexOfCnpj = CursorUtil.getColumnIndexOrThrow(_cursor, "cgcent");
      final int _cursorIndexOfRamoAtividade = CursorUtil.getColumnIndexOrThrow(_cursor, "ramoatividade");
      final int _cursorIndexOfEndereco = CursorUtil.getColumnIndexOrThrow(_cursor, "endereco");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final List<EntityCliente> _result = new ArrayList<EntityCliente>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final EntityCliente _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpCodigo;
        _tmpCodigo = _cursor.getString(_cursorIndexOfCodigo);
        final String _tmpRazao_social;
        _tmpRazao_social = _cursor.getString(_cursorIndexOfRazaoSocial);
        final String _tmpNomeFantasia;
        _tmpNomeFantasia = _cursor.getString(_cursorIndexOfNomeFantasia);
        final String _tmpCnpj;
        _tmpCnpj = _cursor.getString(_cursorIndexOfCnpj);
        final String _tmpRamo_atividade;
        _tmpRamo_atividade = _cursor.getString(_cursorIndexOfRamoAtividade);
        final String _tmpEndereco;
        _tmpEndereco = _cursor.getString(_cursorIndexOfEndereco);
        final String _tmpStatus;
        _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        _item = new EntityCliente(_tmpId,_tmpCodigo,_tmpRazao_social,_tmpNomeFantasia,_tmpCnpj,_tmpRamo_atividade,_tmpEndereco,_tmpStatus);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<ClienteWithContatos>> getClienteWithContato() {
    final String _sql = "SELECT * FROM mxscliente";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"mxscontato","mxscliente"}, true, new Callable<List<ClienteWithContatos>>() {
      @Override
      public List<ClienteWithContatos> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "idCliente");
            final int _cursorIndexOfCodigo = CursorUtil.getColumnIndexOrThrow(_cursor, "codcli");
            final int _cursorIndexOfRazaoSocial = CursorUtil.getColumnIndexOrThrow(_cursor, "razaosocial");
            final int _cursorIndexOfNomeFantasia = CursorUtil.getColumnIndexOrThrow(_cursor, "nomefantasia");
            final int _cursorIndexOfCnpj = CursorUtil.getColumnIndexOrThrow(_cursor, "cgcent");
            final int _cursorIndexOfRamoAtividade = CursorUtil.getColumnIndexOrThrow(_cursor, "ramoatividade");
            final int _cursorIndexOfEndereco = CursorUtil.getColumnIndexOrThrow(_cursor, "endereco");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
            final LongSparseArray<ArrayList<EntityContato>> _collectionLstContatos = new LongSparseArray<ArrayList<EntityContato>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
              ArrayList<EntityContato> _tmpLstContatosCollection = _collectionLstContatos.get(_tmpKey);
              if (_tmpLstContatosCollection == null) {
                _tmpLstContatosCollection = new ArrayList<EntityContato>();
                _collectionLstContatos.put(_tmpKey, _tmpLstContatosCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipmxscontatoAscomKengyProjetomaximaDatabaseEntityEntityContato(_collectionLstContatos);
            final List<ClienteWithContatos> _result = new ArrayList<ClienteWithContatos>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final ClienteWithContatos _item;
              final EntityCliente _tmpCliente;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfCodigo) && _cursor.isNull(_cursorIndexOfRazaoSocial) && _cursor.isNull(_cursorIndexOfNomeFantasia) && _cursor.isNull(_cursorIndexOfCnpj) && _cursor.isNull(_cursorIndexOfRamoAtividade) && _cursor.isNull(_cursorIndexOfEndereco) && _cursor.isNull(_cursorIndexOfStatus))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpCodigo;
                _tmpCodigo = _cursor.getString(_cursorIndexOfCodigo);
                final String _tmpRazao_social;
                _tmpRazao_social = _cursor.getString(_cursorIndexOfRazaoSocial);
                final String _tmpNomeFantasia;
                _tmpNomeFantasia = _cursor.getString(_cursorIndexOfNomeFantasia);
                final String _tmpCnpj;
                _tmpCnpj = _cursor.getString(_cursorIndexOfCnpj);
                final String _tmpRamo_atividade;
                _tmpRamo_atividade = _cursor.getString(_cursorIndexOfRamoAtividade);
                final String _tmpEndereco;
                _tmpEndereco = _cursor.getString(_cursorIndexOfEndereco);
                final String _tmpStatus;
                _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
                _tmpCliente = new EntityCliente(_tmpId,_tmpCodigo,_tmpRazao_social,_tmpNomeFantasia,_tmpCnpj,_tmpRamo_atividade,_tmpEndereco,_tmpStatus);
              }  else  {
                _tmpCliente = null;
              }
              ArrayList<EntityContato> _tmpLstContatosCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpLstContatosCollection_1 = _collectionLstContatos.get(_tmpKey_1);
              if (_tmpLstContatosCollection_1 == null) {
                _tmpLstContatosCollection_1 = new ArrayList<EntityContato>();
              }
              _item = new ClienteWithContatos(_tmpCliente,_tmpLstContatosCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<PedidoWithLegends>> getHistPedFromBD() {
    final String _sql = "SELECT * FROM mxspedidos";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"legendas","mxspedidos"}, true, new Callable<List<PedidoWithLegends>>() {
      @Override
      public List<PedidoWithLegends> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfNumeroPedRca = CursorUtil.getColumnIndexOrThrow(_cursor, "numpedrca");
            final int _cursorIndexOfNumeroPedErp = CursorUtil.getColumnIndexOrThrow(_cursor, "numpederp");
            final int _cursorIndexOfCodigoCliente = CursorUtil.getColumnIndexOrThrow(_cursor, "codcli");
            final int _cursorIndexOfNOMECLIENTE = CursorUtil.getColumnIndexOrThrow(_cursor, "nomecliente");
            final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
            final int _cursorIndexOfCritica = CursorUtil.getColumnIndexOrThrow(_cursor, "critica");
            final int _cursorIndexOfTipo = CursorUtil.getColumnIndexOrThrow(_cursor, "tipo");
            final LongSparseArray<ArrayList<EntityLegendaPedido>> _collectionLstLegendas = new LongSparseArray<ArrayList<EntityLegendaPedido>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfNumeroPedRca);
              ArrayList<EntityLegendaPedido> _tmpLstLegendasCollection = _collectionLstLegendas.get(_tmpKey);
              if (_tmpLstLegendasCollection == null) {
                _tmpLstLegendasCollection = new ArrayList<EntityLegendaPedido>();
                _collectionLstLegendas.put(_tmpKey, _tmpLstLegendasCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshiplegendasAscomKengyProjetomaximaDatabaseEntityEntityLegendaPedido(_collectionLstLegendas);
            final List<PedidoWithLegends> _result = new ArrayList<PedidoWithLegends>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final PedidoWithLegends _item;
              final EntityPedido _tmpPedido;
              if (! (_cursor.isNull(_cursorIndexOfNumeroPedRca) && _cursor.isNull(_cursorIndexOfNumeroPedErp) && _cursor.isNull(_cursorIndexOfCodigoCliente) && _cursor.isNull(_cursorIndexOfNOMECLIENTE) && _cursor.isNull(_cursorIndexOfData) && _cursor.isNull(_cursorIndexOfStatus) && _cursor.isNull(_cursorIndexOfCritica) && _cursor.isNull(_cursorIndexOfTipo))) {
                final int _tmpNumero_ped_Rca;
                _tmpNumero_ped_Rca = _cursor.getInt(_cursorIndexOfNumeroPedRca);
                final String _tmpNumero_ped_erp;
                _tmpNumero_ped_erp = _cursor.getString(_cursorIndexOfNumeroPedErp);
                final String _tmpCodigoCliente;
                _tmpCodigoCliente = _cursor.getString(_cursorIndexOfCodigoCliente);
                final String _tmpNOMECLIENTE;
                _tmpNOMECLIENTE = _cursor.getString(_cursorIndexOfNOMECLIENTE);
                final String _tmpData;
                _tmpData = _cursor.getString(_cursorIndexOfData);
                final String _tmpStatus;
                _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
                final String _tmpCritica;
                _tmpCritica = _cursor.getString(_cursorIndexOfCritica);
                final String _tmpTipo;
                _tmpTipo = _cursor.getString(_cursorIndexOfTipo);
                _tmpPedido = new EntityPedido(_tmpNumero_ped_Rca,_tmpNumero_ped_erp,_tmpCodigoCliente,_tmpNOMECLIENTE,_tmpData,_tmpStatus,_tmpCritica,_tmpTipo);
              }  else  {
                _tmpPedido = null;
              }
              ArrayList<EntityLegendaPedido> _tmpLstLegendasCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfNumeroPedRca);
              _tmpLstLegendasCollection_1 = _collectionLstLegendas.get(_tmpKey_1);
              if (_tmpLstLegendasCollection_1 == null) {
                _tmpLstLegendasCollection_1 = new ArrayList<EntityLegendaPedido>();
              }
              _item = new PedidoWithLegends(_tmpPedido,_tmpLstLegendasCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  private void __fetchRelationshipmxscontatoAscomKengyProjetomaximaDatabaseEntityEntityContato(final LongSparseArray<ArrayList<EntityContato>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<EntityContato>> _tmpInnerMap = new LongSparseArray<ArrayList<EntityContato>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipmxscontatoAscomKengyProjetomaximaDatabaseEntityEntityContato(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<EntityContato>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipmxscontatoAscomKengyProjetomaximaDatabaseEntityEntityContato(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `userCreatorId`,`nome`,`telefone`,`celular`,`conjugue`,`tipo`,`time`,`email`,`datanascimento`,`datanascimentoconjugue` FROM `mxscontato` WHERE `userCreatorId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "userCreatorId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfUserCreatorId = CursorUtil.getColumnIndexOrThrow(_cursor, "userCreatorId");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
      final int _cursorIndexOfTelefone = CursorUtil.getColumnIndexOrThrow(_cursor, "telefone");
      final int _cursorIndexOfCelular = CursorUtil.getColumnIndexOrThrow(_cursor, "celular");
      final int _cursorIndexOfConjuge = CursorUtil.getColumnIndexOrThrow(_cursor, "conjugue");
      final int _cursorIndexOfTipo = CursorUtil.getColumnIndexOrThrow(_cursor, "tipo");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final int _cursorIndexOfEMail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfDataNascimento = CursorUtil.getColumnIndexOrThrow(_cursor, "datanascimento");
      final int _cursorIndexOfDataNascimentoConjuge = CursorUtil.getColumnIndexOrThrow(_cursor, "datanascimentoconjugue");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<EntityContato> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final EntityContato _item_1;
          final String _tmpNome;
          _tmpNome = _cursor.getString(_cursorIndexOfNome);
          final String _tmpTelefone;
          _tmpTelefone = _cursor.getString(_cursorIndexOfTelefone);
          final String _tmpCelular;
          _tmpCelular = _cursor.getString(_cursorIndexOfCelular);
          final String _tmpConjuge;
          _tmpConjuge = _cursor.getString(_cursorIndexOfConjuge);
          final String _tmpTipo;
          _tmpTipo = _cursor.getString(_cursorIndexOfTipo);
          final String _tmpTime;
          _tmpTime = _cursor.getString(_cursorIndexOfTime);
          final String _tmpE_mail;
          _tmpE_mail = _cursor.getString(_cursorIndexOfEMail);
          final String _tmpData_nascimento;
          _tmpData_nascimento = _cursor.getString(_cursorIndexOfDataNascimento);
          final String _tmpDataNascimentoConjuge;
          _tmpDataNascimentoConjuge = _cursor.getString(_cursorIndexOfDataNascimentoConjuge);
          _item_1 = new EntityContato(_tmpNome,_tmpTelefone,_tmpCelular,_tmpConjuge,_tmpTipo,_tmpTime,_tmpE_mail,_tmpData_nascimento,_tmpDataNascimentoConjuge);
          final int _tmpUserCreatorId;
          _tmpUserCreatorId = _cursor.getInt(_cursorIndexOfUserCreatorId);
          _item_1.setUserCreatorId(_tmpUserCreatorId);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshiplegendasAscomKengyProjetomaximaDatabaseEntityEntityLegendaPedido(final LongSparseArray<ArrayList<EntityLegendaPedido>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<EntityLegendaPedido>> _tmpInnerMap = new LongSparseArray<ArrayList<EntityLegendaPedido>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshiplegendasAscomKengyProjetomaximaDatabaseEntityEntityLegendaPedido(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<EntityLegendaPedido>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshiplegendasAscomKengyProjetomaximaDatabaseEntityEntityLegendaPedido(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `idlegend`,`legenda`,`pedidocreatorid` FROM `legendas` WHERE `pedidocreatorid` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "pedidocreatorid");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfIdLegend = CursorUtil.getColumnIndexOrThrow(_cursor, "idlegend");
      final int _cursorIndexOfLegenda = CursorUtil.getColumnIndexOrThrow(_cursor, "legenda");
      final int _cursorIndexOfPedidoCreatorId = CursorUtil.getColumnIndexOrThrow(_cursor, "pedidocreatorid");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<EntityLegendaPedido> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final EntityLegendaPedido _item_1;
          final int _tmpIdLegend;
          _tmpIdLegend = _cursor.getInt(_cursorIndexOfIdLegend);
          final String _tmpLegenda;
          _tmpLegenda = _cursor.getString(_cursorIndexOfLegenda);
          final int _tmpPedidoCreatorId;
          _tmpPedidoCreatorId = _cursor.getInt(_cursorIndexOfPedidoCreatorId);
          _item_1 = new EntityLegendaPedido(_tmpIdLegend,_tmpLegenda,_tmpPedidoCreatorId);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
