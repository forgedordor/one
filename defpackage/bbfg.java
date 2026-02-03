package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbfg {
    public static final eksp a = eksp.c("BugleShareRecentImage");
    public final Context b;
    public final fcsu c;
    public final bbfj d;
    private final eosc g;
    private final eoqr h = new eoqr();
    public final Object e = new Object();
    public boolean f = false;

    public bbfg(Context context, fcsu fcsuVar, eosc eoscVar, bbfj bbfjVar) {
        this.b = context;
        this.c = fcsuVar;
        this.g = eoscVar;
        this.d = bbfjVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0042
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void a(final com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9, final java.lang.String r10, final long r11, final java.util.Set r13) {
        /*
            r8 = this;
            boolean r0 = r9.b()
            if (r0 != 0) goto L44
            java.lang.Object r1 = r8.e
            monitor-enter(r1)
            boolean r0 = r8.f     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L15
            r0 = 1
            r8.f = r0     // Catch: java.lang.Throwable -> L11
            goto L16
        L11:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L40
        L15:
            r0 = 0
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L44
            eoqr r0 = r8.h
            bbff r1 = new bbff
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r7 = r13
            r1.<init>()
            java.util.concurrent.Callable r9 = defpackage.eiid.l(r1)
            eosc r10 = r2.g
            com.google.common.util.concurrent.ListenableFuture r9 = r0.a(r9, r10)
            eiju r9 = defpackage.eiju.g(r9)
            eora r10 = defpackage.auvh.b()
            eoqg r11 = defpackage.eoqg.a
            r9.k(r10, r11)
            return
        L3d:
            r0 = move-exception
            r2 = r8
        L3f:
            r9 = r0
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            throw r9
        L42:
            r0 = move-exception
            goto L3f
        L44:
            r2 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbfg.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, java.lang.String, long, java.util.Set):void");
    }
}
