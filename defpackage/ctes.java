package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctes extends cten {
    public cmqa ag;

    @Override // defpackage.dn
    public final Dialog gK(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(G());
        View viewInflate = G().getLayoutInflater().inflate(R.layout.sms_storage_low_warning_dialog, (ViewGroup) null);
        ListView listView = (ListView) viewInflate.findViewById(R.id.free_storage_action_list);
        Resources resources = G().getResources();
        String strB = this.ag.b(z(), this.ag.a());
        ArrayList arrayList = new ArrayList();
        arrayList.add(resources.getString(R.string.delete_all_media));
        arrayList.add(resources.getString(R.string.delete_oldest_messages, strB));
        listView.setAdapter((ListAdapter) new cter(this, G(), arrayList));
        builder.setTitle(R.string.low_storage_space_notification_and_dialog_title).setView(viewInflate).setNegativeButton(R.string.ignore, new DialogInterface.OnClickListener() { // from class: ctep
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        return alertDialogCreate;
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        G().finish();
    }
}
