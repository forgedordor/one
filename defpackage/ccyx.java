package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccyx extends ddzt {
    private final Context d;
    private final eigp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccyx(Context context, eigp eigpVar) {
        super(new ddzn(context), ccyy.a(context));
        dcfe dcfeVar = ddys.a;
        this.d = context;
        this.e = eigpVar;
    }

    @Override // defpackage.ddzt
    protected final void a(Configurations configurations) {
        ArrayList arrayList;
        eieh eiehVarC = this.e.c("BuglePhenotypeCommitter#handleConfigurations", "com/google/android/apps/messaging/shared/experiments/common/BuglePhenotypeCommitter", "handleConfigurations", 33);
        try {
            SharedPreferences.Editor editorEdit = this.d.getSharedPreferences("PhenotypePrefs", 0).edit();
            if (!configurations.f) {
                editorEdit.clear();
            }
            for (Configuration configuration : configurations.d) {
                if (configuration != null) {
                    for (String str : configuration.c) {
                        editorEdit.remove(str);
                    }
                    for (Flag flag : configuration.b) {
                        int i = flag.g;
                        if (i == 1) {
                            editorEdit.putLong(flag.a, flag.b());
                        } else if (i == 2) {
                            editorEdit.putBoolean(flag.a, flag.e());
                        } else if (i == 3) {
                            editorEdit.putFloat(flag.a, (float) flag.a());
                        } else if (i == 4) {
                            editorEdit.putString(flag.a, flag.c());
                        } else if (i == 5) {
                            editorEdit.putString(flag.a, Base64.encodeToString(flag.f(), 3));
                        }
                    }
                }
            }
            editorEdit.putString("__phenotype_server_token", configurations.c);
            editorEdit.putLong("__phenotype_configuration_version", configurations.g);
            editorEdit.putString("__phenotype_snapshot_token", configurations.a);
            if (!editorEdit.commit()) {
                Log.w("PhenotypeFlagCommitter", "Failed to commit Phenotype configs to SharedPreferences!");
            }
            synchronized (cdag.d) {
                arrayList = new ArrayList(cdag.e);
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((cczv) arrayList.get(i2)).l();
            }
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
