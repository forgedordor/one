package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.telephony.SmsMessage;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxbz extends ArrayAdapter {
    final /* synthetic */ cxca a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxbz(cxca cxcaVar, Context context, String[] strArr) {
        super(context, R.layout.sms_mms_dump_file_list_item, strArr);
        this.a = cxcaVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (view == null || !(view instanceof TextView)) ? (TextView) LayoutInflater.from(getContext()).inflate(R.layout.sms_mms_dump_file_list_item, viewGroup, false) : (TextView) view;
        final String str = (String) getItem(i);
        textView.setText(str);
        textView.setOnClickListener(new View.OnClickListener() { // from class: cxby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                byte[] bArrB;
                fhaz fhazVarA;
                cxbz cxbzVar = this.a;
                cxca cxcaVar = cxbzVar.a;
                cxcaVar.hh();
                String str2 = str;
                if (str2 != null) {
                    if (!"load".equals(cxcaVar.ah)) {
                        cxca cxcaVar2 = cxbzVar.a;
                        if ("email".equals(cxcaVar2.ah)) {
                            Resources resourcesB = cxcaVar2.B();
                            Context contextZ = cxcaVar2.z();
                            if (contextZ == null) {
                                throw new IllegalStateException("Context cannot be null.");
                            }
                            File fileA = ((cqjy) cxcaVar2.al.b()).a(str2, false, contextZ);
                            File fileE = cbpu.e(contextZ, fileA.getName());
                            try {
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileA));
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileE));
                                efvk.a(bufferedInputStream, bufferedOutputStream);
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                            } catch (IOException e) {
                                ((ekrd) ((ekrd) ((ekrd) cxca.ag.i()).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugSmsMmsFromDumpFileDialogFragment", "emailDumpFile", (char) 222, "DebugSmsMmsFromDumpFileDialogFragment.java")).q("emailDumpFile: failed to copy dump file for sharing");
                            }
                            Uri uriD = cbpu.d(contextZ, fileA.getName());
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("application/octet-stream");
                            intent.putExtra("android.intent.extra.STREAM", uriD);
                            intent.putExtra("android.intent.extra.SUBJECT", resourcesB.getString(R.string.email_sms_mms_dump_file_subject));
                            intent.putExtra("extra_subject_mandatory", true);
                            intent.setFlags(1);
                            cxcaVar2.G().startActivity(Intent.createChooser(intent, resourcesB.getString(R.string.email_sms_mms_dump_file_chooser_title)));
                            return;
                        }
                        return;
                    }
                    Context context = cxbzVar.getContext();
                    if (str2.startsWith("smsdump-")) {
                        SmsMessage[] smsMessageArrA = cxcaVar.aj.a(str2);
                        if (((arrc) cxcaVar.an.b()).a()) {
                            fhazVarA = cqdr.a();
                        } else {
                            fhazVarA = fhaz.a;
                        }
                        fhaz fhazVar = fhazVarA;
                        if (smsMessageArrA.length != 0) {
                            cxcaVar.ai.a(null, cxcaVar.G(), -1, 0, smsMessageArrA, 0L, fhazVar);
                            return;
                        } else {
                            cqca.f("Bugle", "receiveFromDumpFile: invalid sms dump file ".concat(str2));
                            return;
                        }
                    }
                    if (!str2.startsWith("mmsdump-")) {
                        cqca.f("Bugle", "receiveFromDumpFile: invalid dump file name ".concat(str2));
                        return;
                    }
                    cmoq cmoqVar = cxcaVar.ak;
                    try {
                        byte[] bArrS = cmoqVar.c.s(str2, context);
                        lx lxVarA = cmoq.a(bArrS);
                        ll llVar = new ll();
                        long epochMilli = (cmoqVar.b.f().toEpochMilli() / 1000) + 600;
                        byte[] bytes = str2.getBytes();
                        lq lqVar = llVar.a;
                        lqVar.j(bytes, 152);
                        llVar.d(lxVarA.a.a(141));
                        lq lqVar2 = lxVarA.a;
                        llVar.b(lqVar2.c(137));
                        lqVar.g(lxVarA.a.c(150), 150);
                        lqVar.h(epochMilli, 136);
                        lqVar.h(bArrS == null ? 0L : bArrS.length, 142);
                        lqVar.j(lqVar2.k(138), 138);
                        Context context2 = cmoqVar.a;
                        cvw cvwVar = bxlf.a;
                        Uri.Builder builderScheme = new Uri.Builder().authority(bxlg.a(context2)).scheme("content");
                        builderScheme.appendPath(str2);
                        llVar.e(builderScheme.build().toString().getBytes());
                        bArrB = new ceal(context2, llVar).b();
                    } catch (cmor | li unused) {
                        bArrB = null;
                    }
                    if (bArrB != null) {
                        if (bArrB.length > 0) {
                            byte[] bArr = bArrB;
                            if (bArr != null) {
                                cxcaVar.ao.a(-1, bArr, 0L, 0, 0).s();
                                return;
                            } else {
                                cqca.f("Bugle", "receiveFromDumpFile: invalid mms dump file ".concat(str2));
                                return;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Empty or zero length PDU data");
                }
            }
        });
        return textView;
    }
}
