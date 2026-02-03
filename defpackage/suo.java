package defpackage;

import android.speech.RecognitionSupport;
import android.speech.RecognitionSupportCallback;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suo implements RecognitionSupportCallback {
    private final fdis a;

    public suo(fdis fdisVar) {
        this.a = fdisVar;
    }

    private static final Map a(List list, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Locale localeForLanguageTag = Locale.forLanguageTag((String) it.next());
            localeForLanguageTag.getClass();
            fcti fctiVar = new fcti(localeForLanguageTag, new aonx(localeForLanguageTag, -1, i));
            linkedHashMap.put(fctiVar.a, fctiVar.b);
        }
        return linkedHashMap;
    }

    public final void onError(int i) {
        ((eksl) sux.a.j()).r("checkRecognitionSupport returned error %d, returning empty language pack details.", i);
        this.a.w(fcvp.a);
    }

    public final void onSupportResult(RecognitionSupport recognitionSupport) {
        recognitionSupport.getClass();
        List supportedOnDeviceLanguages = recognitionSupport.getSupportedOnDeviceLanguages();
        supportedOnDeviceLanguages.getClass();
        Map mapA = a(supportedOnDeviceLanguages, 4);
        List pendingOnDeviceLanguages = recognitionSupport.getPendingOnDeviceLanguages();
        pendingOnDeviceLanguages.getClass();
        Map mapJ = fcwa.j(mapA, a(pendingOnDeviceLanguages, 3));
        List installedOnDeviceLanguages = recognitionSupport.getInstalledOnDeviceLanguages();
        installedOnDeviceLanguages.getClass();
        this.a.w(fcwa.j(mapJ, a(installedOnDeviceLanguages, 2)));
    }
}
