package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daeh extends dadh {
    public static final ruf h;
    public final dabl i;
    private final lvj j;
    private final List k;
    private final fcsu l;

    static {
        rue rueVar = new rue();
        rueVar.b();
        h = rueVar.a();
    }

    public daeh(Context context, lvj lvjVar, dacu dacuVar, dafl daflVar, fcsu fcsuVar, fcsu fcsuVar2, dabl dablVar, boolean z) {
        super(context, dacuVar, daflVar, fcsuVar, z);
        this.j = lvjVar;
        this.k = new ArrayList();
        this.i = dablVar;
        this.l = fcsuVar2;
    }

    @Override // defpackage.dadh
    protected final wv F(ViewGroup viewGroup) {
        final daeg daegVar = new daeg(this.a, this.j, LayoutInflater.from(viewGroup.getContext()).inflate(true != ((asgw) this.l.b()).a() ? R.layout.zero_state_search_link_result_item_v2 : R.layout.zero_state_search_link_result_item_coolranch, viewGroup, false), new daea());
        daegVar.u.setOnClickListener(new View.OnClickListener() { // from class: dadz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                daeh daehVar = this.a;
                daehVar.d.u(new dabq(4, daegVar.ft() - daehVar.g));
                ((dabm) daehVar.e.b()).e(4);
                daehVar.i.f(6, 5);
            }
        });
        return daegVar;
    }

    @Override // defpackage.dadh
    protected final void G(wv wvVar, int i) {
        ((daeg) wvVar).C((dacq) this.k.get(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:3:0x0006, B:8:0x001d, B:10:0x0026, B:12:0x0033, B:14:0x0039, B:15:0x0047), top: B:24:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(java.util.List r6) {
        /*
            r5 = this;
            java.lang.String r0 = "LinksAdapter#updateResults"
            eieu r0 = defpackage.eiiy.k(r0)
            r1 = r6
            ekoe r1 = (defpackage.ekoe) r1     // Catch: java.lang.Throwable -> L54
            int r1 = r1.c     // Catch: java.lang.Throwable -> L54
            r5.H(r1)     // Catch: java.lang.Throwable -> L54
            int r2 = r5.g     // Catch: java.lang.Throwable -> L54
            java.util.List r3 = r5.k     // Catch: java.lang.Throwable -> L54
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L54
            if (r4 != 0) goto L1b
            if (r1 == 0) goto L50
            r4 = 0
        L1b:
            if (r1 != 0) goto L24
            r3.clear()     // Catch: java.lang.Throwable -> L54
            r5.x(r2, r4)     // Catch: java.lang.Throwable -> L54
            goto L50
        L24:
            if (r4 != 0) goto L31
            r3.addAll(r6)     // Catch: java.lang.Throwable -> L54
            int r6 = r3.size()     // Catch: java.lang.Throwable -> L54
            r5.w(r2, r6)     // Catch: java.lang.Throwable -> L54
            goto L50
        L31:
            if (r4 != r1) goto L47
            boolean r1 = r5.J()     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L47
            r3.clear()     // Catch: java.lang.Throwable -> L54
            r3.addAll(r6)     // Catch: java.lang.Throwable -> L54
            int r6 = r3.size()     // Catch: java.lang.Throwable -> L54
            r5.u(r2, r6)     // Catch: java.lang.Throwable -> L54
            goto L50
        L47:
            r3.clear()     // Catch: java.lang.Throwable -> L54
            r3.addAll(r6)     // Catch: java.lang.Throwable -> L54
            r5.p()     // Catch: java.lang.Throwable -> L54
        L50:
            r0.close()
            return
        L54:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r0 = move-exception
            r6.addSuppressed(r0)
        L5d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daeh.M(java.util.List):void");
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        return Long.parseLong(((dacq) this.k.get(i - this.g)).m());
    }

    @Override // defpackage.dadh
    protected final int l() {
        return this.k.size();
    }
}
