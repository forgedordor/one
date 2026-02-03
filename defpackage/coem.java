package defpackage;

import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coem implements egsc {
    static final cczv a = cdag.q(160232109, "enable_work_item");
    public static final /* synthetic */ int b = 0;
    private final codx c;

    public coem(codx codxVar) {
        this.c = codxVar;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        if (!((Boolean) a.e()).booleanValue()) {
            return eijx.e(new qao());
        }
        final codx codxVar = this.c;
        return eijx.f(new Runnable() { // from class: cods
            @Override // java.lang.Runnable
            public final void run() {
                codx codxVar2 = codxVar;
                if (!codxVar2.f()) {
                    codx.a.r("Removing entire cache of sms/mms - missing sms/mms permission");
                    codxVar2.b(0L);
                    return;
                }
                File[] fileArrListFiles = codxVar2.a().listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        Matcher matcher = codx.b.matcher(file.getName());
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            ejyb.e(strGroup);
                            if (PartsTable.a(strGroup) == null && !codx.d(file)) {
                                cqbd cqbdVarE = codx.a.e();
                                cqbdVarE.I("Unable to delete orphaned file");
                                cqbdVarE.A("fileName", file.getName());
                                cqbdVarE.r();
                            }
                        }
                    }
                }
            }
        }, codxVar.c).h(new ejvr() { // from class: coel
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = coem.b;
                return new qao();
            }
        }, eoqg.a);
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}
