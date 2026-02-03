package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcpt extends dcpq {
    final /* synthetic */ Map a;
    final /* synthetic */ dcpy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcpt(dcpy dcpyVar, String str, DroidGuardResultsRequest droidGuardResultsRequest, Map map) {
        super(str, droidGuardResultsRequest);
        this.a = map;
        this.b = dcpyVar;
    }

    @Override // defpackage.dcpq
    public final /* bridge */ /* synthetic */ Object a(String str, Throwable th) {
        return dcrd.a(dcrd.c("getResults " + (true != this.b.b.e() ? "(service thread not alive) " : "") + str, th));
    }

    @Override // defpackage.dcpq
    public final /* bridge */ /* synthetic */ Object c(dcpo dcpoVar) {
        String strA = dcpoVar.a(this.a);
        dcpoVar.close();
        return strA;
    }
}
