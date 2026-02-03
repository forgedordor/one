package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ffy implements kep {
    public ffv b;

    @Override // defpackage.kep
    public /* synthetic */ void b(ihu ihuVar) {
        throw null;
    }

    @Override // defpackage.kep
    public /* synthetic */ void c() {
        throw null;
    }

    public abstract void e();

    @Override // defpackage.kep
    public /* synthetic */ void h(kew kewVar, kel kelVar, jyi jyiVar, fdap fdapVar, ihu ihuVar, ihu ihuVar2) {
        throw null;
    }

    @Override // defpackage.kep
    public final void i() {
        jmj jmjVarA;
        ffv ffvVar = this.b;
        if (ffvVar == null || (jmjVarA = ffvVar.a()) == null) {
            return;
        }
        jmjVarA.a();
    }

    @Override // defpackage.kep
    public final void j() {
        jmj jmjVarA;
        ffv ffvVar = this.b;
        if (ffvVar == null || (jmjVarA = ffvVar.a()) == null) {
            return;
        }
        jmjVarA.b();
    }

    public final void k(ffv ffvVar) {
        if (this.b != null) {
            ebs.d("Expected textInputModifierNode to be null");
        }
        this.b = ffvVar;
    }

    public final void l(ffv ffvVar) {
        if (this.b != ffvVar) {
            ebs.d("Expected textInputModifierNode to be " + ffvVar + " but was " + this.b);
        }
        this.b = null;
    }
}
