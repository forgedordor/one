package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epjc implements esob {
    public final ekgb f;
    public final ekhx g;
    private final ekgp j;
    public static final dzfh a = new dzfh("communication.messages.penpal.proto.penpalservice.v2.PenpalService.");
    private static final dzfh h = new dzfh("communication.messages.penpal.proto.penpalservice.v2.PenpalService/");
    public static final esoa b = new epiz();
    public static final esoa c = new epja();
    public static final esoa d = new epjb();
    public static final epjc e = new epjc();
    private static final dzfh i = new dzfh("aratea-pa.googleapis.com");

    private epjc() {
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.h("aratea-pa.mtls.googleapis.com");
        ekfwVar.h("autopush-aratea-pa.mtls.sandbox.googleapis.com");
        ekfwVar.h("autopush-aratea-pa.sandbox.googleapis.com");
        ekfwVar.h("staging-aratea-pa.mtls.sandbox.googleapis.com");
        ekfwVar.h("staging-aratea-pa.sandbox.googleapis.com");
        ekfwVar.h("aratea-pa.googleapis.com");
        this.f = ekfwVar.g();
        this.g = new ekhv().g();
        esoa esoaVar = b;
        esoa esoaVar2 = c;
        esoa esoaVar3 = d;
        ekhx.s(esoaVar, esoaVar2, esoaVar3);
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("MagicRewriteMessage", esoaVar);
        ekgiVar.i("SmarterReplies", esoaVar2);
        ekgiVar.i("ApplyPhotoBooth", esoaVar3);
        this.j = ekgiVar.c();
        new ekgi().c();
    }

    @Override // defpackage.esob
    public final dzfh a() {
        return i;
    }

    @Override // defpackage.esob
    public final esoa b(String str) {
        String str2 = h.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        ekgp ekgpVar = this.j;
        if (ekgpVar.containsKey(strSubstring)) {
            return (esoa) ekgpVar.get(strSubstring);
        }
        return null;
    }
}
