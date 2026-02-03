package defpackage;

import android.database.Cursor;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwk {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/emotify/data/content/EmotifyDataService");
    public final fdjx b;
    public final dngc c;
    private final fctc d;

    public dnwk(final fcsu fcsuVar, dnwr dnwrVar, fdjx fdjxVar, dngc dngcVar) {
        fcsuVar.getClass();
        dnwrVar.getClass();
        fdjxVar.getClass();
        dngcVar.getClass();
        this.b = fdjxVar;
        this.c = dngcVar;
        this.d = fctd.a(new fdae() { // from class: dnvs
            @Override // defpackage.fdae
            public final Object invoke() {
                ecmf ecmfVar = (ecmf) fcsuVar.b();
                ecnr ecnrVar = dnvt.a;
                return ecmfVar.a("emotify", dnvt.a);
            }
        });
    }

    public static final dnvg d(Cursor cursor) {
        byte[] blob;
        Integer numValueOf = Integer.valueOf(cursor.getColumnIndex(GroupManagementRequest.DATA_TAG));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf == null || (blob = cursor.getBlob(numValueOf.intValue())) == null) {
            throw new IllegalStateException("Column data not found");
        }
        dnwn dnwnVar = (dnwn) evsn.parseFrom(dnwn.a, blob, evrr.a());
        dnwnVar.getClass();
        return dnwr.i(dnwnVar);
    }

    public final dnvg a(Cursor cursor) {
        if (true != cursor.moveToFirst()) {
            cursor = null;
        }
        if (cursor != null) {
            return d(cursor);
        }
        return null;
    }

    public final ecmd b() {
        return (ecmd) this.d.a();
    }

    public final Object c(String str, fcxy fcxyVar) {
        return this.c.c("EmotifyDataService#getCustomSticker", new dnwd(this, str, null), fcxyVar);
    }
}
