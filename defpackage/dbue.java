package defpackage;

import android.content.Context;
import com.google.android.gms.auth.folsom.internal.IKeyRetrievalService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbue implements dcir {
    final /* synthetic */ String a;

    public dbue(String str) {
        this.a = str;
    }

    @Override // defpackage.dcir
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dbuv dbuvVar = (dbuv) obj;
        dbud dbudVar = new dbud((defr) obj2);
        IKeyRetrievalService iKeyRetrievalService = (IKeyRetrievalService) dbuvVar.w();
        Context context = dbuvVar.c;
        iKeyRetrievalService.listVaults(dbudVar, this.a, ddlh.a());
    }
}
