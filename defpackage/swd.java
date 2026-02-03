package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.speech.SpeechRecognizer;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swd implements eyif {
    public static Optional a(final Context context, Optional optional) {
        Optional map;
        context.getClass();
        optional.getClass();
        cczi ccziVar = stt.a;
        if (stt.a(context)) {
            map = Optional.of(SpeechRecognizer.createOnDeviceSpeechRecognizer(context));
        } else {
            final fdap fdapVar = new fdap() { // from class: swa
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    return SpeechRecognizer.createSpeechRecognizer(context, (ComponentName) obj);
                }
            };
            map = optional.map(new Function() { // from class: swb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return fdapVar.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            map.getClass();
        }
        map.getClass();
        return map;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
