package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbzi {
    public static final ezol a(ConversationIdType conversationIdType, String str) {
        botb botbVarE = botm.e();
        botbVarE.A("ConversationUtils#getConversationDestination");
        botl botlVar = new botl();
        botlVar.r(conversationIdType);
        botbVarE.h(botlVar);
        bopp boppVar = botm.c;
        botbVarE.c(boppVar.O, boppVar.y);
        bojh bojhVar = (bojh) botbVarE.b().l();
        if (bojhVar == null) {
            return null;
        }
        boolean z = bojhVar.k() == 2;
        felm felmVar = z ? felm.GROUP_ID : felm.PHONE_NUMBER;
        ezok ezokVar = (ezok) ezol.a.createBuilder();
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).d = "RCS";
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).b = felmVar.a();
        if (!z) {
            str = bojhVar.ab();
            str.getClass();
        }
        ezokVar.copyOnWrite();
        ezol ezolVar = (ezol) ezokVar.instance;
        str.getClass();
        ezolVar.c = str;
        evsn evsnVarBuild = ezokVar.build();
        evsnVarBuild.getClass();
        return (ezol) evsnVarBuild;
    }
}
