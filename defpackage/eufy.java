package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufy {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("^[^|]*\\|([^|]*)\\|[^|]*$");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(int i, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        ekqh it = ((ekgb) list).iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((ejwi) it.next()).b(new ejvr() { // from class: eufw
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return ((eufx) obj).a;
                }
            }).e(""));
        }
        return String.format(Locale.US, "%s|%s|%d", "androidtc", new ejwc(";").b(arrayList), Integer.valueOf(i));
    }
}
