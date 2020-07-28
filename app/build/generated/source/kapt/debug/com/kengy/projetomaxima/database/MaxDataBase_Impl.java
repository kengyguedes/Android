package com.kengy.projetomaxima.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MaxDataBase_Impl extends MaxDataBase {
  private volatile PedidoDao _pedidoDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(11) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `mxspedidos` (`numpedrca` INTEGER NOT NULL, `numpederp` TEXT NOT NULL, `codcli` TEXT NOT NULL, `nomecliente` TEXT NOT NULL, `data` TEXT NOT NULL, `status` TEXT NOT NULL, `critica` TEXT NOT NULL, `tipo` TEXT NOT NULL, PRIMARY KEY(`numpedrca`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `mxscliente` (`idCliente` INTEGER NOT NULL, `codcli` TEXT NOT NULL, `razaosocial` TEXT NOT NULL, `nomefantasia` TEXT NOT NULL, `cgcent` TEXT NOT NULL, `ramoatividade` TEXT NOT NULL, `endereco` TEXT NOT NULL, `status` TEXT NOT NULL, PRIMARY KEY(`idCliente`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `mxscontato` (`userCreatorId` INTEGER NOT NULL, `nome` TEXT NOT NULL, `telefone` TEXT NOT NULL, `celular` TEXT NOT NULL, `conjugue` TEXT NOT NULL, `tipo` TEXT NOT NULL, `time` TEXT NOT NULL, `email` TEXT NOT NULL, `datanascimento` TEXT NOT NULL, `datanascimentoconjugue` TEXT NOT NULL, PRIMARY KEY(`nome`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `legendas` (`idlegend` INTEGER NOT NULL, `legenda` TEXT NOT NULL, `pedidocreatorid` INTEGER NOT NULL, PRIMARY KEY(`idlegend`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5951aeebfb3674e2693470cc982ea367')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `mxspedidos`");
        _db.execSQL("DROP TABLE IF EXISTS `mxscliente`");
        _db.execSQL("DROP TABLE IF EXISTS `mxscontato`");
        _db.execSQL("DROP TABLE IF EXISTS `legendas`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMxspedidos = new HashMap<String, TableInfo.Column>(8);
        _columnsMxspedidos.put("numpedrca", new TableInfo.Column("numpedrca", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxspedidos.put("numpederp", new TableInfo.Column("numpederp", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxspedidos.put("codcli", new TableInfo.Column("codcli", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxspedidos.put("nomecliente", new TableInfo.Column("nomecliente", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxspedidos.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxspedidos.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxspedidos.put("critica", new TableInfo.Column("critica", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxspedidos.put("tipo", new TableInfo.Column("tipo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMxspedidos = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMxspedidos = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMxspedidos = new TableInfo("mxspedidos", _columnsMxspedidos, _foreignKeysMxspedidos, _indicesMxspedidos);
        final TableInfo _existingMxspedidos = TableInfo.read(_db, "mxspedidos");
        if (! _infoMxspedidos.equals(_existingMxspedidos)) {
          return new RoomOpenHelper.ValidationResult(false, "mxspedidos(com.kengy.projetomaxima.database.entity.EntityPedido).\n"
                  + " Expected:\n" + _infoMxspedidos + "\n"
                  + " Found:\n" + _existingMxspedidos);
        }
        final HashMap<String, TableInfo.Column> _columnsMxscliente = new HashMap<String, TableInfo.Column>(8);
        _columnsMxscliente.put("idCliente", new TableInfo.Column("idCliente", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscliente.put("codcli", new TableInfo.Column("codcli", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscliente.put("razaosocial", new TableInfo.Column("razaosocial", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscliente.put("nomefantasia", new TableInfo.Column("nomefantasia", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscliente.put("cgcent", new TableInfo.Column("cgcent", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscliente.put("ramoatividade", new TableInfo.Column("ramoatividade", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscliente.put("endereco", new TableInfo.Column("endereco", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscliente.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMxscliente = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMxscliente = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMxscliente = new TableInfo("mxscliente", _columnsMxscliente, _foreignKeysMxscliente, _indicesMxscliente);
        final TableInfo _existingMxscliente = TableInfo.read(_db, "mxscliente");
        if (! _infoMxscliente.equals(_existingMxscliente)) {
          return new RoomOpenHelper.ValidationResult(false, "mxscliente(com.kengy.projetomaxima.database.entity.EntityCliente).\n"
                  + " Expected:\n" + _infoMxscliente + "\n"
                  + " Found:\n" + _existingMxscliente);
        }
        final HashMap<String, TableInfo.Column> _columnsMxscontato = new HashMap<String, TableInfo.Column>(10);
        _columnsMxscontato.put("userCreatorId", new TableInfo.Column("userCreatorId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscontato.put("nome", new TableInfo.Column("nome", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscontato.put("telefone", new TableInfo.Column("telefone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscontato.put("celular", new TableInfo.Column("celular", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscontato.put("conjugue", new TableInfo.Column("conjugue", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscontato.put("tipo", new TableInfo.Column("tipo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscontato.put("time", new TableInfo.Column("time", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscontato.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscontato.put("datanascimento", new TableInfo.Column("datanascimento", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMxscontato.put("datanascimentoconjugue", new TableInfo.Column("datanascimentoconjugue", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMxscontato = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMxscontato = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMxscontato = new TableInfo("mxscontato", _columnsMxscontato, _foreignKeysMxscontato, _indicesMxscontato);
        final TableInfo _existingMxscontato = TableInfo.read(_db, "mxscontato");
        if (! _infoMxscontato.equals(_existingMxscontato)) {
          return new RoomOpenHelper.ValidationResult(false, "mxscontato(com.kengy.projetomaxima.database.entity.EntityContato).\n"
                  + " Expected:\n" + _infoMxscontato + "\n"
                  + " Found:\n" + _existingMxscontato);
        }
        final HashMap<String, TableInfo.Column> _columnsLegendas = new HashMap<String, TableInfo.Column>(3);
        _columnsLegendas.put("idlegend", new TableInfo.Column("idlegend", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLegendas.put("legenda", new TableInfo.Column("legenda", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLegendas.put("pedidocreatorid", new TableInfo.Column("pedidocreatorid", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLegendas = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLegendas = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLegendas = new TableInfo("legendas", _columnsLegendas, _foreignKeysLegendas, _indicesLegendas);
        final TableInfo _existingLegendas = TableInfo.read(_db, "legendas");
        if (! _infoLegendas.equals(_existingLegendas)) {
          return new RoomOpenHelper.ValidationResult(false, "legendas(com.kengy.projetomaxima.database.entity.EntityLegendaPedido).\n"
                  + " Expected:\n" + _infoLegendas + "\n"
                  + " Found:\n" + _existingLegendas);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "5951aeebfb3674e2693470cc982ea367", "406f21b2325007aba54a6524c13376ea");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "mxspedidos","mxscliente","mxscontato","legendas");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `mxspedidos`");
      _db.execSQL("DELETE FROM `mxscliente`");
      _db.execSQL("DELETE FROM `mxscontato`");
      _db.execSQL("DELETE FROM `legendas`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public PedidoDao Dao() {
    if (_pedidoDao != null) {
      return _pedidoDao;
    } else {
      synchronized(this) {
        if(_pedidoDao == null) {
          _pedidoDao = new PedidoDao_Impl(this);
        }
        return _pedidoDao;
      }
    }
  }
}
