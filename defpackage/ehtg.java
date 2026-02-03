package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ehtg<T> extends BroadcastReceiver implements ehsz {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver");
    public diep b;
    public long c;
    public eosd d;
    private final Class e;
    private final boolean f;
    private fcsu g;

    /* compiled from: PG */
    public interface a {
        diep dA();

        eosd eP();

        eiby ey();

        fcsu gw();

        void iV();

        void iW();
    }

    protected ehtg(Class cls, boolean z) {
        this.e = cls;
        this.f = z;
    }

    protected ehti a(Object obj) {
        throw null;
    }

    @Override // defpackage.ehsz
    public final /* synthetic */ long b() {
        return -1L;
    }

    @Override // defpackage.ehsz
    public final /* synthetic */ long c() {
        return -1L;
    }

    protected abstract ListenableFuture d(Context context, Intent intent, Class cls);

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b9, code lost:
    
        r0 = r14.getPackageManager();
        r8 = defpackage.ebsx.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bf, code lost:
    
        monitor-enter(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c2, code lost:
    
        if (defpackage.ebsx.b != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c4, code lost:
    
        r9 = new android.content.Intent();
        r9.setPackage(r14.getPackageName());
        defpackage.ebsx.b = r0.queryBroadcastReceivers(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d6, code lost:
    
        r0 = defpackage.ebsx.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d8, code lost:
    
        monitor-exit(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d9, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e1, code lost:
    
        if (r0.hasNext() == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f1, code lost:
    
        if (r4.equals(((android.content.pm.ResolveInfo) r0.next()).activityInfo.name) != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f9, code lost:
    
        throw new defpackage.ebsw(r15);
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r14, final android.content.Intent r15) throws defpackage.ebsw {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehtg.onReceive(android.content.Context, android.content.Intent):void");
    }
}
