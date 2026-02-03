package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzms implements bzmx {
    private final int a;
    private final String b;

    public bzms(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.bzmx
    public final void a(embz embzVar) {
        emdd emddVar = (emdd) emdf.a.createBuilder();
        emddVar.getClass();
        emddVar.copyOnWrite();
        emdf emdfVar = (emdf) emddVar.instance;
        int i = 2;
        emdfVar.b |= 2;
        emdfVar.d = this.b;
        int i2 = this.a;
        if (i2 == 1) {
            i = 4;
        } else if (i2 == 2) {
            i = 3;
        } else if (i2 != 3) {
            i = i2 != 7 ? 1 : 6;
        }
        emddVar.copyOnWrite();
        emdf emdfVar2 = (emdf) emddVar.instance;
        emdfVar2.c = i - 1;
        emdfVar2.b = 1 | emdfVar2.b;
        emdf emdfVar3 = (emdf) emddVar.build();
        embzVar.copyOnWrite();
        emca emcaVar = (emca) embzVar.instance;
        emca emcaVar2 = emca.a;
        emdfVar3.getClass();
        evtg evtgVar = emcaVar.h;
        if (!evtgVar.c()) {
            emcaVar.h = evsn.mutableCopy(evtgVar);
        }
        emcaVar.h.add(emdfVar3);
    }

    @Override // defpackage.bzmx
    public final void c(bmoy bmoyVar) {
        bmoyVar.e(this.a);
        bmoyVar.d(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzms)) {
            return false;
        }
        bzms bzmsVar = (bzms) obj;
        return this.a == bzmsVar.a && fdbq.f(this.b, bzmsVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CmsBackupDependencyMissingContext(dependencyTableType=" + this.a + ", dependencyBugleId=" + this.b + ")";
    }

    @Override // defpackage.bzmx
    public final /* synthetic */ void b(emcw emcwVar) {
    }
}
