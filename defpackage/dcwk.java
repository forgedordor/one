package defpackage;

import android.app.ApplicationErrorReport;
import android.text.TextUtils;
import com.google.android.gms.feedback.FeedbackOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcwk extends dcwj {
    public dcwk() {
        this.h = new ApplicationErrorReport();
        this.h.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.h.crashInfo.throwLineNumber = -1;
    }

    @Override // defpackage.dcwj
    public final FeedbackOptions a() {
        dclh.m(this.h.crashInfo.exceptionClassName);
        dclh.m(this.h.crashInfo.throwClassName);
        dclh.m(this.h.crashInfo.throwMethodName);
        dclh.m(this.h.crashInfo.stackTrace);
        if (TextUtils.isEmpty(this.h.crashInfo.throwFileName)) {
            this.h.crashInfo.throwFileName = "unknown";
        }
        FeedbackOptions feedbackOptionsA = super.a();
        feedbackOptionsA.d.crashInfo = this.h.crashInfo;
        feedbackOptionsA.g = null;
        return feedbackOptionsA;
    }

    public dcwk(Throwable th) {
        this.h = new ApplicationErrorReport();
        this.h.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.h.crashInfo.throwLineNumber = -1;
        this.h.crashInfo = new ApplicationErrorReport.CrashInfo(th);
    }
}
