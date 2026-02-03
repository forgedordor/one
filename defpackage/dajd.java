package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dajd implements dajg {
    public final fcsu a;
    public final fcsu b;
    public final czqs c;
    public final ains d;
    public final fcsu e;
    public final dakl f;
    public final fcsu g;
    public final eigp h;

    public dajd(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, czqs czqsVar, ains ainsVar, fcsu fcsuVar4, dakl daklVar, eigp eigpVar) {
        this.g = fcsuVar;
        this.a = fcsuVar2;
        this.b = fcsuVar3;
        this.c = czqsVar;
        this.d = ainsVar;
        this.e = fcsuVar4;
        this.f = daklVar;
        this.h = eigpVar;
    }

    @Override // defpackage.dajg
    public final void a(Activity activity, final Uri uri, final String str, final Uri uri2, final String str2) {
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: daiz
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ((aijh) this.a.e.b()).F(uri, str, uri2, str2);
            }
        };
        eeji eejiVar = new eeji(activity);
        eejiVar.l(activity.getResources().getString(R.string.unsupported_file_save_alert));
        eejiVar.r(R.string.save_attachment, onClickListener);
        eejiVar.m(R.string.unsupported_file_save_cancel, new DialogInterface.OnClickListener() { // from class: dajc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        eejiVar.create().show();
    }
}
