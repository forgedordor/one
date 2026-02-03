package defpackage;

import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eguk {
    public static efwo a(Set set) {
        Iterator it = set.iterator();
        Integer numValueOf = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("account_id_")) {
                ejwl.m(numValueOf == null, "Account ID already found. This work is tagged for two accounts.");
                numValueOf = Integer.valueOf(Integer.parseInt(str.replace("account_id_", "")));
            }
        }
        if (numValueOf == null || numValueOf.intValue() == -1) {
            throw new IllegalArgumentException("Input set had no valid account in it.");
        }
        return efwo.b(numValueOf.intValue());
    }

    public static efwo b(WorkerParameters workerParameters) {
        return a(workerParameters.c);
    }

    static String c(efwo efwoVar) {
        ejwl.a(true);
        ejwl.a(efwoVar.a() != -1);
        return "account_id_" + efwoVar.a();
    }
}
