package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyyu implements eind {
    final /* synthetic */ cyye a;

    public cyyu(cyye cyyeVar) {
        this.a = cyyeVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        final cyye cyyeVar = this.a;
        final daok daokVar = (daok) einbVar;
        eg egVarG = cyyeVar.l.G();
        final Runnable runnable = new Runnable() { // from class: cyyc
            @Override // java.lang.Runnable
            public final void run() {
                daok daokVar2 = daokVar;
                cyyeVar.l.startActivityForResult(daoq.a(daokVar2.d(), daokVar2.c(), daokVar2.b(), daokVar2.a()), 501);
            }
        };
        eeji eejiVar = new eeji(egVarG);
        eejiVar.u(R.string.title_of_video_attachment_needs_trimming);
        eejiVar.k(R.string.text_of_video_attachment_needs_trimming);
        eejiVar.r(R.string.open_video_trimmer_dialog_positive, new DialogInterface.OnClickListener() { // from class: daon
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                runnable.run();
            }
        });
        eejiVar.m(R.string.open_video_trimmer_dialog_negative, new DialogInterface.OnClickListener() { // from class: daoo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        eejiVar.create().show();
        return eine.a;
    }
}
