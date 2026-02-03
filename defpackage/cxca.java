package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxca extends cxte {
    public static final ekrg ag = ekrg.c("com/google/android/apps/messaging/ui/debug/DebugSmsMmsFromDumpFileDialogFragment");
    public String ah;
    public cley ai;
    public cxcb aj;
    public cmoq ak;
    public fcsu al;
    public fcsu am;
    public fcsu an;
    public axzo ao;
    private String[] ap;

    @Override // defpackage.dn
    public final Dialog gK(Bundle bundle) {
        Bundle bundle2 = this.m;
        Object serializable = bundle2.getSerializable("dump_files");
        this.ap = serializable != null ? (String[]) serializable : new String[0];
        this.ah = bundle2.getString(GroupManagementRequest.ACTION_TAG);
        View viewInflate = G().getLayoutInflater().inflate(R.layout.debug_sms_mms_from_dump_file_dialog, (ViewGroup) null);
        ((ListView) viewInflate.findViewById(R.id.dump_file_list)).setAdapter((ListAdapter) new cxbz(this, G(), this.ap));
        AlertDialog.Builder builder = new AlertDialog.Builder(G());
        Resources resourcesB = B();
        if ("load".equals(this.ah)) {
            builder.setTitle(resourcesB.getString(R.string.load_sms_mms_from_dump_file_dialog_title));
        } else if ("email".equals(this.ah)) {
            builder.setTitle(resourcesB.getString(R.string.email_sms_mms_from_dump_file_dialog_title));
        }
        builder.setView(viewInflate);
        return builder.create();
    }
}
