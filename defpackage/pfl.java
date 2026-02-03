package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pfl extends lvv {
    public final pex a;
    public final fcyh i;
    private final pdq j;
    private final pdu l;
    private final boolean k = true;
    public final AtomicBoolean h = new AtomicBoolean(true);
    private final AtomicBoolean m = new AtomicBoolean(false);
    private final AtomicBoolean n = new AtomicBoolean(false);

    public pfl(pex pexVar, pdq pdqVar, String[] strArr) {
        this.a = pexVar;
        this.j = pdqVar;
        this.l = new pfi(strArr, this);
        this.i = pexVar.r() ? pexVar.j() : fcyi.a;
    }

    public abstract Object b();

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6 A[Catch: all -> 0x002c, Exception -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x0027, B:40:0x00b6), top: B:58:0x0027, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #1 {all -> 0x002c, blocks: (B:12:0x0027, B:38:0x00ae, B:40:0x00b6, B:47:0x00cd, B:44:0x00c3, B:45:0x00ca), top: B:58:0x0027, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ac -> B:38:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00dc -> B:52:0x00dd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfl.c(fcxy):java.lang.Object");
    }

    @Override // defpackage.lvv
    protected final void h() {
        this.j.b.add(this);
        fdil.d(this.a.k(), this.i, null, new pfj(this, null), 2);
    }

    @Override // defpackage.lvv
    protected final void i() {
        this.j.b.remove(this);
    }
}
