package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.gms.feedback.FileTeleporter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aciu implements acin {
    private final aiws a;
    private final Context b;

    public aciu(aiws aiwsVar, Context context) {
        this.a = aiwsVar;
        this.b = context;
    }

    @Override // defpackage.acin
    public final eiju a() {
        return eijx.e(new HashMap());
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final eiju c() {
        final aiws aiwsVar = this.a;
        return eijx.g(new Callable() { // from class: aiwr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList = new ArrayList();
                if (((Boolean) ccze.V.e()).booleanValue()) {
                    aiws aiwsVar2 = aiwsVar;
                    byte[] bArrB = aiwsVar2.b();
                    if (bArrB != null) {
                        arrayList.add(new FileTeleporter(bArrB, "Message status log"));
                    }
                    byte[] bArrA = aiwsVar2.a();
                    if (bArrA != null) {
                        arrayList.add(new FileTeleporter(bArrA, "App event log"));
                    }
                }
                return arrayList;
            }
        }, aiwsVar.a);
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju d() {
        return cdfd.d();
    }

    @Override // defpackage.acin
    public final elhx e() {
        return elhx.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_MESSAGES_STATUS_HISTORY;
    }

    @Override // defpackage.acin
    public final String f() {
        return this.b.getString(R.string.messages_status_feedback_data_description);
    }

    @Override // defpackage.acin
    public final String g() {
        return this.b.getString(R.string.messages_status_feedback_data_detail_title);
    }

    @Override // defpackage.acin
    public final String h() {
        return this.b.getString(R.string.messages_status_feedback_data_name);
    }

    @Override // defpackage.acin
    public final String i() {
        return this.b.getString(R.string.messages_status_feedback_data_rationale);
    }

    @Override // defpackage.acin
    public final String j() {
        return this.b.getString(R.string.messages_status_feedback_data_rationale_title);
    }
}
