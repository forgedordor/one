package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class ufv extends fdbb implements fdat {
    public static final ufv a = new ufv();

    public ufv() {
        super(2, emsz.class, "mergeFrom", "mergeFrom(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;", 8);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        emsz emszVar = (emsz) obj;
        emta emtaVar = (emta) obj2;
        emszVar.getClass();
        emtaVar.getClass();
        emszVar.mergeFrom((emsz) emtaVar);
        return fctx.a;
    }
}
