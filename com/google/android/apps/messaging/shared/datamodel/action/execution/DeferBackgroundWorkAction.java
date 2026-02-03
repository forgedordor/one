package com.google.android.apps.messaging.shared.datamodel.action.execution;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.aymo;
import defpackage.ayoe;
import defpackage.ayon;
import defpackage.ayoo;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class DeferBackgroundWorkAction extends Action<Void> {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ayon();
    public final ayoe a;

    /* compiled from: PG */
    public interface a {
        ayoo hA();
    }

    public DeferBackgroundWorkAction(ayoe ayoeVar, Parcel parcel) {
        super(parcel, elgm.DEFER_BACKGROUND_WORK_ACTION);
        this.a = ayoeVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("DeferBackgroundWorkAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        aymo aymoVar = this.v;
        if (aymoVar.x("bundled_background_actions")) {
            ArrayList arrayListN = aymoVar.n("bundled_background_actions", Bundle.class);
            arrayListN.getClass();
            Collection.EL.stream(arrayListN).map(new Function() { // from class: ayoj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Action actionC = this.a.a.c((Bundle) obj);
                    actionC.getClass();
                    return actionC;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).forEach(new Consumer() { // from class: ayok
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.a.w.add((Action) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return null;
        }
        ArrayList arrayListN2 = aymoVar.n("background_actions", Action.class);
        arrayListN2.getClass();
        Collection.EL.stream(arrayListN2).forEach(new Consumer() { // from class: ayok
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.a.w.add((Action) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public DeferBackgroundWorkAction(final ayoe ayoeVar, ArrayList arrayList) {
        super(elgm.DEFER_BACKGROUND_WORK_ACTION);
        this.a = ayoeVar;
        this.v.u("bundled_background_actions", (ArrayList) Collection.EL.stream(arrayList).map(new Function() { // from class: ayol
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ayoeVar.a((Action) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: ayom
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        })));
    }
}
