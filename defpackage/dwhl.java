package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwhl implements View.OnClickListener {
    final /* synthetic */ ejwi a;
    final /* synthetic */ dwhm b;

    public dwhl(dwhm dwhmVar, ejwi ejwiVar) {
        this.a = ejwiVar;
        this.b = dwhmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        Object objC = this.a.c();
        Intent intent = new Intent("android.intent.action.VIEW");
        String strConcat = ((dwhd) objC).f;
        String[] strArr = dvhz.a;
        int i = 0;
        while (true) {
            if (i >= 3) {
                z = false;
                break;
            }
            String str = strArr[i];
            if (strConcat.regionMatches(true, 0, str, 0, str.length())) {
                z = true;
                if (!strConcat.regionMatches(false, 0, str, 0, str.length())) {
                    strConcat = String.valueOf(str).concat(String.valueOf(strConcat.substring(str.length())));
                }
            } else {
                i++;
            }
        }
        if (!z) {
            strConcat = String.valueOf(strArr[0]).concat(String.valueOf(strConcat));
        }
        dwhm dwhmVar = this.b;
        intent.setData(Uri.parse(strConcat));
        ((Activity) dwhmVar.getContext()).startActivity(intent);
    }
}
