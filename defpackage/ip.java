package defpackage;

import android.content.DialogInterface;
import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ip implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController a;
    final /* synthetic */ ir b;

    public ip(ir irVar, AlertController alertController) {
        this.b = irVar;
        this.a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AlertController alertController = this.a;
        ir irVar = this.b;
        DialogInterface.OnClickListener onClickListener = irVar.t;
        kb kbVar = alertController.b;
        onClickListener.onClick(kbVar, i);
        if (irVar.x) {
            return;
        }
        kbVar.dismiss();
    }
}
