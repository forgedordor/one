package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dziu extends dzit {
    public final String a;

    public dziu(String str) {
        this.a = str;
    }

    @Override // defpackage.dzit
    public final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // defpackage.dzit
    public final String b() {
        return this.a;
    }

    public dziu(dzfh dzfhVar) {
        this.a = String.valueOf(dzfhVar);
    }

    public dziu(Class cls) {
        this.a = cls.getName();
    }

    public dziu(Enum r1) {
        this.a = r1.name();
    }
}
