package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dowo extends fdbo implements fdap {
    public static final dowo a = new dowo();

    public dowo() {
        super(1, dovy.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return new dovy(str);
    }
}
