package defpackage;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Intent;
import android.provider.ContactsContract;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agce implements afyw {
    private final Activity a;
    private final lvc b;
    private final fdjx c;

    public agce(Activity activity, lvc lvcVar, fdjx fdjxVar) {
        fdjxVar.getClass();
        this.a = activity;
        this.b = lvcVar;
        this.c = fdjxVar;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) throws IOException {
        agcb agcbVar = (agcb) afzvVar;
        this.b.c(new agcd(this.c, agcbVar.d));
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(agcbVar.c);
        intent.setDataAndType(ContentUris.withAppendedId(ContactsContract.Data.CONTENT_URI, agcbVar.a), agcbVar.b);
        long j = eiid.a;
        Intent intent2 = new Intent(intent);
        eihr eihrVarT = eiid.t(intent2);
        try {
            this.a.startActivityForResult(intent2, 335300904);
            fczl.a(eihrVarT, null);
            return fctx.a;
        } finally {
        }
    }
}
