package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agcv implements afyw {
    private final Activity a;
    private final fcsu b;
    private final Optional c;
    private final dajg d;

    public agcv(Activity activity, fcsu fcsuVar, Optional optional, dajg dajgVar) {
        fcsuVar.getClass();
        optional.getClass();
        this.a = activity;
        this.b = fcsuVar;
        this.c = optional;
        this.d = dajgVar;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        agcu agcuVar = (agcu) afzvVar;
        Optional optional = this.c;
        if (optional.isPresent()) {
            String str = agcuVar.b;
            if (le.g(str)) {
                Activity activity = this.a;
                Uri uriB = bxli.b(activity, agcuVar.a, agcuVar.c, str, agcuVar.d);
                if ("text/calendar".equals(str) || "application/ics".equals(str)) {
                    ((aijh) this.b.b()).w(activity, uriB, str);
                } else {
                    ((tlw) optional.get()).b(activity, uriB);
                }
                return fctx.a;
            }
        }
        String str2 = agcuVar.b;
        if (!le.u(str2)) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            Uri uri = agcuVar.a;
            intent.setDataAndType(uri, str2);
            Activity activity2 = this.a;
            if (intent.resolveActivity(activity2.getPackageManager()) == null) {
                if (agcuVar.e) {
                    this.d.a(activity2, uri, str2, uri, agcuVar.c);
                }
                return fctx.a;
            }
        }
        String strA = le.a(str2);
        Activity activity3 = this.a;
        ((aijh) this.b.b()).w(activity3, bxli.b(activity3, agcuVar.a, agcuVar.c, str2, agcuVar.d), strA);
        return fctx.a;
    }
}
