package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acnr implements acnq {
    private final Context a;
    private final cpch b;
    private final eygg c;
    private final fcsu d;

    public acnr(Context context, cpch cpchVar, eygg eyggVar, fcsu fcsuVar) {
        this.a = context;
        this.b = cpchVar;
        this.c = eyggVar;
        this.d = fcsuVar;
    }

    @Override // defpackage.acnq
    public final ListenableFuture a(emgm emgmVar, Throwable th, ekgp ekgpVar) {
        dcwj dcwjVar;
        dcwi dcwiVar = (dcwi) this.d.b();
        if (dcwiVar == null) {
            return eork.i(null);
        }
        if (th != null) {
            String strA = ebul.a(th);
            String string = th.getCause() instanceof cgew ? this.a.getString(R.string.report_invalid_thread_id_issue_description) : th.getCause() instanceof cgex ? this.a.getString(R.string.report_thread_id_not_found_description) : this.a.getString(R.string.report_issue_description);
            dcwjVar = new dcwk(th);
            dcwjVar.c = string;
            dcwjVar.e(strA);
        } else {
            dcwjVar = new dcwj(this.a);
        }
        HashMap map = new HashMap();
        map.put("IssueTypeName", emgmVar.name());
        if (ekgpVar != null) {
            map.putAll(ekgpVar);
        }
        eygg eyggVar = this.c;
        ((cdga) eyggVar.b()).c(ekgp.l("EXTRA", new cdgm(map)));
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = true != this.b.g() ? 0 : 2;
        dcwjVar.e = themeSettings;
        dcwn dcwnVar = new dcwn();
        dcwnVar.b();
        dcwjVar.f = dcwnVar.a();
        dcwjVar.d((dcwa) eyggVar.b(), false);
        dcwjVar.d = (String) ccze.k.e();
        return drgi.a(dcwiVar.c(dcwjVar.a()));
    }
}
