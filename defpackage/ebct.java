package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import j$.util.Objects;
import java.io.InputStream;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebct {
    public static void a(InputStream inputStream, Consumer consumer) {
        String strA = dhij.a(inputStream);
        while (!ejwk.c(strA)) {
            Pair pairCreate = null;
            if (TextUtils.isEmpty(strA)) {
                dhja.q("Unable to parse header from an empty line!", new Object[0]);
            } else {
                String[] strArrSplit = strA.split(": ");
                if (strArrSplit.length != 2) {
                    dhja.q("Invalid CPIM header format: %s", strA);
                } else {
                    pairCreate = Pair.create(strArrSplit[0], strArrSplit[1]);
                }
            }
            if (Objects.isNull(pairCreate)) {
                dhja.q("Skipping invalid element: %s", strA);
            } else {
                consumer.accept(pairCreate);
            }
            strA = dhij.a(inputStream);
        }
    }
}
