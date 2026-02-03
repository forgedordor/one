package defpackage;

import android.content.Context;
import com.google.android.gms.auth.folsom.internal.IKeyRetrievalService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbug implements dcir {
    final /* synthetic */ String a;

    public dbug(String str) {
        this.a = str;
    }

    @Override // defpackage.dcir
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dbuv dbuvVar = (dbuv) obj;
        dbuf dbufVar = new dbuf((defr) obj2);
        IKeyRetrievalService iKeyRetrievalService = (IKeyRetrievalService) dbuvVar.w();
        Context context = dbuvVar.c;
        iKeyRetrievalService.resetSecurityDomain(dbufVar, this.a, ddlh.a());
    }
}
