package defpackage;

import android.content.Context;
import com.google.android.gms.auth.folsom.internal.IKeyRetrievalService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbur implements dcir {
    final /* synthetic */ String a;

    public dbur(String str) {
        this.a = str;
    }

    @Override // defpackage.dcir
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dbuv dbuvVar = (dbuv) obj;
        dbuq dbuqVar = new dbuq((defr) obj2);
        IKeyRetrievalService iKeyRetrievalService = (IKeyRetrievalService) dbuvVar.w();
        Context context = dbuvVar.c;
        iKeyRetrievalService.markLocalKeysAsStale(dbuqVar, this.a, ddlh.a());
    }
}
