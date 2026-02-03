package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cioi extends fcyz implements fdat {
    int a;
    final /* synthetic */ cioj b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ cigb f;
    final /* synthetic */ String g;
    final /* synthetic */ String h;
    final /* synthetic */ alqm i;
    final /* synthetic */ SelfIdentityId j;
    final /* synthetic */ List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cioi(cioj ciojVar, ConversationIdType conversationIdType, String str, String str2, cigb cigbVar, String str3, String str4, alqm alqmVar, SelfIdentityId selfIdentityId, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ciojVar;
        this.c = conversationIdType;
        this.d = str;
        this.e = str2;
        this.f = cigbVar;
        this.g = str3;
        this.h = str4;
        this.i = alqmVar;
        this.j = selfIdentityId;
        this.k = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cioi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cioj ciojVar = this.b;
        ConversationIdType conversationIdType = this.c;
        String str = this.d;
        String str2 = this.e;
        cigb cigbVar = this.f;
        String str3 = this.g;
        String str4 = this.h;
        alqm alqmVar = this.i;
        SelfIdentityId selfIdentityId = this.j;
        List list = this.k;
        this.a = 1;
        Object objB = ciojVar.b(conversationIdType, str, str2, cigbVar, str3, str4, alqmVar, selfIdentityId, list, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cioi(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, fcxyVar);
    }
}
