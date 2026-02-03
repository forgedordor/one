package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekyc extends ekye {
    public ekyc() {
    }

    public static ekyc c() {
        return new ekyc(new ekxe(1.0d, 0.0d), ekxk.c());
    }

    @Override // defpackage.ekye
    public final ekxe a() {
        return new ekxe(this.a);
    }

    @Override // defpackage.ekye
    public final ekxk b() {
        return new ekxk(this.b);
    }

    public final ekyd d() {
        return new ekyd(new ekxe(this.a), new ekxk(this.b));
    }

    public final void e(ekyd ekydVar) {
        this.a.f(ekydVar.a);
        this.b.i(ekydVar.b);
    }

    public ekyc(ekxe ekxeVar, ekxk ekxkVar) {
        super(ekxeVar, ekxkVar);
    }
}
