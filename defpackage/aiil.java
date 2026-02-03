package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import com.google.android.apps.messaging.R;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiil extends efrh {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/settings/search/MessagesSearchIndexablesProvider$MessagesSearchIndexablesProviderInternal");

    /* compiled from: PG */
    public interface a {
        crnp cP();

        ekgb eI();
    }

    private static MatrixCursor d() {
        return new MatrixCursor(efrg.b);
    }

    private final boolean e() {
        return ((a) ehli.a(getContext(), a.class)).cP().e();
    }

    @Override // defpackage.efrh
    public final Cursor a() {
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/settings/search/MessagesSearchIndexablesProvider$MessagesSearchIndexablesProviderInternal", "queryNonIndexableKeys", 65, "MessagesSearchIndexablesProvider.java")).q("MessagesSearchIndexablesProvider: Querying NonIndexableKeys.");
        if (!e()) {
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "Bugle");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/settings/search/MessagesSearchIndexablesProvider$MessagesSearchIndexablesProviderInternal", "queryNonIndexableKeys", 67, "MessagesSearchIndexablesProvider.java")).q("MessagesSearchIndexablesProvider: The device is not SMS capable.");
            return d();
        }
        MatrixCursor matrixCursor = new MatrixCursor(efrg.c);
        if (((Boolean) ((cczi) cuyu.b.get()).e()).booleanValue()) {
            Context context = getContext();
            context.getClass();
            matrixCursor.addRow(new Object[]{context.getString(R.string.cmc_consent_key)});
        }
        return matrixCursor;
    }

    @Override // defpackage.efrh
    public final Cursor b() {
        return d();
    }

    @Override // defpackage.efrh
    public final Cursor c() {
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/settings/search/MessagesSearchIndexablesProvider$MessagesSearchIndexablesProviderInternal", "queryXmlResources", 50, "MessagesSearchIndexablesProvider.java")).q("MessagesSearchIndexablesProvider: Querying XmlResources.");
        if (e()) {
            final aiio aiioVar = new aiio(this, ((a) ehli.a(getContext(), a.class)).eI());
            Collection.EL.stream(aiioVar.c).filter(new Predicate() { // from class: aiim
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) ((aiir) obj).c().get()).booleanValue();
                }
            }).forEach(new Consumer() { // from class: aiin
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    aiir aiirVar = (aiir) obj;
                    String strB = aiirVar.b();
                    int iA = aiirVar.a();
                    aiio aiioVar2 = aiioVar;
                    aiioVar2.b.newRow().add("rank", 0).add("xmlResId", Integer.valueOf(iA)).add("iconResId", 0).add("intentAction", "android.intent.action.MAIN").add("intentTargetPackage", aiioVar2.a).add("intentTargetClass", strB);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return aiioVar.b;
        }
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/settings/search/MessagesSearchIndexablesProvider$MessagesSearchIndexablesProviderInternal", "queryXmlResources", 52, "MessagesSearchIndexablesProvider.java")).q("MessagesSearchIndexablesProvider: The device is not sms capable");
        return d();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }
}
