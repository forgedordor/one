package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyc {
    public static final void a(kyd kydVar, Set set, Map map) {
        if (TextUtils.isEmpty(kydVar.e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = kydVar.c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
    }
}
