package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciod extends fcyz implements fdat {
    final /* synthetic */ cioj a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ SelfIdentityId d;
    final /* synthetic */ cigb e;
    final /* synthetic */ alqm f;
    final /* synthetic */ ConversationIdType g;
    final /* synthetic */ String h;
    final /* synthetic */ List i;
    final /* synthetic */ String j;
    private /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciod(fcxy fcxyVar, cioj ciojVar, String str, String str2, SelfIdentityId selfIdentityId, cigb cigbVar, alqm alqmVar, ConversationIdType conversationIdType, String str3, List list, String str4) {
        super(2, fcxyVar);
        this.a = ciojVar;
        this.b = str;
        this.c = str2;
        this.d = selfIdentityId;
        this.e = cigbVar;
        this.f = alqmVar;
        this.g = conversationIdType;
        this.h = str3;
        this.i = list;
        this.j = str4;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ciod) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        alqm alqmVar = this.f;
        cioj ciojVar = this.a;
        String str = this.b;
        ConversationIdType conversationIdType = this.g;
        String str2 = this.c;
        String str3 = this.h;
        return ciojVar.a.c("MmsGroupUpgradeDatabaseOperations#upgradeMmsGroupToRcs", new cioh(str, str2, this.d, this.e, alqmVar, ciojVar, conversationIdType, str3, this.i, this.j));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ciod ciodVar = new ciod(fcxyVar, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        ciodVar.k = obj;
        return ciodVar;
    }
}
