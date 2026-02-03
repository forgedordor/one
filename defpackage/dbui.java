package defpackage;

import android.content.Context;
import com.google.android.gms.auth.folsom.internal.IKeyRetrievalService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbui implements dcir {
    final /* synthetic */ String a;

    public dbui(String str) {
        this.a = str;
    }

    @Override // defpackage.dcir
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dbuv dbuvVar = (dbuv) obj;
        dbuh dbuhVar = new dbuh((defr) obj2);
        IKeyRetrievalService iKeyRetrievalService = (IKeyRetrievalService) dbuvVar.w();
        Context context = dbuvVar.c;
        iKeyRetrievalService.listSecurityDomainMembers(dbuhVar, this.a, ddlh.a());
    }
}
