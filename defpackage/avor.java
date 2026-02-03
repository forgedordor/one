package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avor {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/conversation/match/ConversationDetailsLogger");
    public final fcsu b;
    public final fcsu c;

    public avor(fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    public static esvh a(ekgb ekgbVar, final awch awchVar) {
        return new esvh(esvg.CONFIRMED_UPLOAD_SAFE_USER_DATA, Collection.EL.stream(ekgbVar).map(new Function() { // from class: avok
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((avog) awchVar.a((String) obj)).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }
}
