package com.kengy.projetomaxima.jobs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/kengy/projetomaxima/jobs/MyJobScheduler;", "Landroid/app/job/JobService;", "()V", "_TAG", "", "_jobCancelled", "", "builder2", "Landroid/app/Notification$Builder;", "getBuilder2", "()Landroid/app/Notification$Builder;", "setBuilder2", "(Landroid/app/Notification$Builder;)V", "channelId", "createNotificationChannel", "", "onStartJob", "params", "Landroid/app/job/JobParameters;", "onStopJob", "app_debug"})
public final class MyJobScheduler extends android.app.job.JobService {
    private java.lang.String _TAG;
    private boolean _jobCancelled;
    @org.jetbrains.annotations.NotNull()
    public android.app.Notification.Builder builder2;
    private final java.lang.String channelId = "NOTIFICACAO_MAXIMA_TECH";
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification.Builder getBuilder2() {
        return null;
    }
    
    public final void setBuilder2(@org.jetbrains.annotations.NotNull()
    android.app.Notification.Builder p0) {
    }
    
    @java.lang.Override()
    public boolean onStartJob(@org.jetbrains.annotations.Nullable()
    android.app.job.JobParameters params) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onStopJob(@org.jetbrains.annotations.Nullable()
    android.app.job.JobParameters params) {
        return false;
    }
    
    public final void createNotificationChannel() {
    }
    
    public MyJobScheduler() {
        super();
    }
}