package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdeb {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/fcm/impl/SmsTickleHandler");
    public final cddi a;
    private final ains c;
    private final Optional d;
    private final cdei e;

    public cdeb(ains ainsVar, Optional optional, cdei cdeiVar, cddi cddiVar) {
        ainsVar.getClass();
        optional.getClass();
        this.c = ainsVar;
        this.d = optional;
        this.e = cdeiVar;
        this.a = cddiVar;
    }

    public final void a(ezua ezuaVar) {
        ezuaVar.getClass();
        if (this.d.isEmpty()) {
            ekrw ekrwVarJ = b.j();
            ekrwVarJ.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/fcm/impl/SmsTickleHandler", "onTickleReceived", 30, "SmsTickleHandler.kt")).q("Ignore received sms tickle because TachyonReceiverManager is not present.");
            return;
        }
        this.c.c("Bugle.PhoneIdentity.FcmPush");
        ezok ezokVar = (ezok) ezol.a.createBuilder();
        felm felmVarB = felm.b(ezuaVar.e);
        if (felmVarB == null) {
            felmVarB = felm.UNRECOGNIZED;
        }
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).b = felmVarB.a();
        String str = ezuaVar.g;
        ezokVar.copyOnWrite();
        ezol ezolVar = (ezol) ezokVar.instance;
        str.getClass();
        ezolVar.d = str;
        String str2 = ezuaVar.f;
        ezokVar.copyOnWrite();
        ezol ezolVar2 = (ezol) ezokVar.instance;
        str2.getClass();
        ezolVar2.c = str2;
        evsn evsnVarBuild = ezokVar.build();
        evsnVarBuild.getClass();
        cdei cdeiVar = this.e;
        ezol ezolVar3 = (ezol) evsnVarBuild;
        String str3 = (ezuaVar.b == 7 ? (eztz) ezuaVar.c : eztz.a).b;
        ejvr ejvrVar = new ejvr() { // from class: cddz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return this.a.a.d((ezol) obj);
            }
        };
        ejvr ejvrVar2 = new ejvr() { // from class: cdea
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return this.a.a.d((ezol) obj);
            }
        };
        Object objE = cmxp.a.e();
        objE.getClass();
        boolean zBooleanValue = ((Boolean) objE).booleanValue();
        Object objE2 = cmxp.b.e();
        objE2.getClass();
        boolean zBooleanValue2 = ((Boolean) objE2).booleanValue();
        Object objE3 = cmxp.c.e();
        objE3.getClass();
        cdeiVar.c(str3, ezolVar3, ejvrVar, ejvrVar2, "Sms", true, false, zBooleanValue, zBooleanValue2, ((Boolean) objE3).booleanValue(), 4);
    }
}
