package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdyx {
    private final fdhz a = new fdhz(new fdza(8, false), fdia.a);

    public final int a() {
        long j = ((fdza) this.a.a).b.c;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object b() {
        while (true) {
            fdhz fdhzVar = this.a;
            fdza fdzaVar = (fdza) fdhzVar.a;
            Object objB = fdzaVar.b();
            if (objB != fdza.a) {
                return objB;
            }
            fdhzVar.d(fdzaVar, fdzaVar.c());
        }
    }

    public final void c() {
        while (true) {
            fdhz fdhzVar = this.a;
            fdza fdzaVar = (fdza) fdhzVar.a;
            if (fdzaVar.d()) {
                return;
            } else {
                fdhzVar.d(fdzaVar, fdzaVar.c());
            }
        }
    }

    public final boolean d(Object obj) {
        while (true) {
            fdhz fdhzVar = this.a;
            fdza fdzaVar = (fdza) fdhzVar.a;
            int iA = fdzaVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return false;
            }
            fdhzVar.d(fdzaVar, fdzaVar.c());
        }
    }
}
