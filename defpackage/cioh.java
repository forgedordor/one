package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cioh implements ejxr {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ SelfIdentityId c;
    final /* synthetic */ cigb d;
    final /* synthetic */ alqm e;
    final /* synthetic */ cioj f;
    final /* synthetic */ ConversationIdType g;
    final /* synthetic */ String h;
    final /* synthetic */ List i;
    final /* synthetic */ String j;

    public cioh(String str, String str2, SelfIdentityId selfIdentityId, cigb cigbVar, alqm alqmVar, cioj ciojVar, ConversationIdType conversationIdType, String str3, List list, String str4) {
        this.a = str;
        this.b = str2;
        this.c = selfIdentityId;
        this.d = cigbVar;
        this.e = alqmVar;
        this.f = ciojVar;
        this.g = conversationIdType;
        this.h = str3;
        this.i = list;
        this.j = str4;
    }

    @Override // defpackage.ejxr
    public final /* synthetic */ Object get() {
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("MmsGroupUpgradeDatabaseOperations#upgradeMmsGroupToRcs");
        boteVar.m();
        boteVar.Q(this.a);
        boteVar.N(this.b);
        boteVar.B(cins.j);
        boteVar.n(((SelfIdentityIdImpl) this.c).a);
        boteVar.A(0);
        String str = this.h;
        if (str == null || str.length() == 0) {
            boteVar.D(bvdp.NAME_IS_AUTOMATIC);
        }
        boteVar.O(this.d);
        alqm alqmVar = this.e;
        Optional optionalE = alqmVar.e();
        optionalE.getClass();
        aubq aubqVar = (aubq) fdct.b(optionalE);
        boteVar.S(aubqVar != null ? aubqVar.d : null);
        cioj ciojVar = this.f;
        boteVar.R(Optional.of(ciojVar.e.f()));
        String str2 = this.j;
        if (ciojVar.f.a() && str2.length() > 0) {
            boteVar.P(Uri.parse(str2));
        }
        ConversationIdType conversationIdType = this.g;
        boteVar.f(conversationIdType);
        fcsu fcsuVar = ciojVar.d;
        ((bakt) fcsuVar.b()).V(conversationIdType, str, 2, false);
        String[] strArr2 = bocg.a;
        bobu bobuVar = new bobu();
        bobuVar.f("MmsGroupUpgradeDatabaseOperations#upgradeMmsGroupToRcs");
        bobuVar.a(new ciof(conversationIdType));
        bobuVar.d();
        String[] strArr3 = boiv.a;
        boil boilVar = new boil();
        boilVar.f("MmsGroupUpgradeDatabaseOperations#upgradeMmsGroupToRcs");
        boilVar.c(new ciog(conversationIdType));
        boilVar.d();
        return Boolean.valueOf(((bakt) fcsuVar.b()).ap(alqmVar.e(), this.i, conversationIdType, false));
    }
}
