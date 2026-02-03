package defpackage;

import android.content.Context;
import com.google.android.gms.auth.folsom.internal.IKeyRetrievalService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbul implements dcir {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    public dbul(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.dcir
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dbuv dbuvVar = (dbuv) obj;
        dbuk dbukVar = new dbuk((defr) obj2);
        IKeyRetrievalService iKeyRetrievalService = (IKeyRetrievalService) dbuvVar.w();
        Context context = dbuvVar.c;
        iKeyRetrievalService.setConsent(dbukVar, this.a, this.b, ddlh.a());
    }
}
