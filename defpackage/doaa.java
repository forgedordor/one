package defpackage;

import android.support.v7.widget.GridLayoutManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doaa extends doad {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/gif/ui/screen/GifScreen");
    private doah aB;
    private GridLayoutManager aC;
    private List aD;
    private final dpxe aE;
    public fdjx ag;
    public doai b;
    public dqav c;
    public final AtomicBoolean d;
    public doam e;

    public doaa() {
        super(new docs(dnzw.a), new dnzu(false, 1023));
        this.d = new AtomicBoolean();
        this.aE = dpxe.c;
    }

    public final doam a() {
        doam doamVar = this.e;
        if (doamVar != null) {
            return doamVar;
        }
        fdbq.c("gifsStickersApi");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doaa.b(int, fcxy):java.lang.Object");
    }

    @Override // defpackage.docj
    public final /* bridge */ /* synthetic */ void e(doav doavVar, String str) {
        dnyz dnyzVar = (dnyz) doavVar;
        bh(new dobe(dnyzVar.a), str);
        fdjx fdjxVar = this.ag;
        if (fdjxVar == null) {
            fdbq.c("remoteIoScope");
            fdjxVar = null;
        }
        fdil.d(fdjxVar, null, null, new dnzy(this, dnyzVar, null), 3);
    }

    @Override // defpackage.docj
    public final void f() {
        dpxz dpxzVar;
        Integer num = ((dnzu) bC()).a;
        if (num != null) {
            fdil.d(bH(), null, null, new dnzz(this, num.intValue(), null), 3);
            return;
        }
        dpyb dpybVarAV = aV();
        if (dpybVarAV == null || (dpxzVar = ((dode) dpybVarAV).k) == null) {
            return;
        }
        dpxzVar.c("");
    }

    @Override // defpackage.dpxo
    public final dpxe t() {
        return this.aE;
    }
}
