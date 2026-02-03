package com.google.android.apps.messaging.shared.api.messaging.selfidentity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.aoez;
import defpackage.aohp;
import defpackage.aohs;
import defpackage.aoht;
import defpackage.aohu;
import defpackage.axcm;
import defpackage.fcsv;
import defpackage.fdap;
import defpackage.fdbk;
import defpackage.fdbq;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class SelfIdentityIdImpl implements SelfIdentityId {
    public static final Parcelable.Creator<SelfIdentityIdImpl> CREATOR = new aoez();
    public final String a;
    private final Optional b;

    public SelfIdentityIdImpl(String str, Optional<axcm> optional) {
        str.getClass();
        optional.getClass();
        this.a = str;
        this.b = optional;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId
    public final axcm a() {
        return (axcm) this.b.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId
    public final String b() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId
    @fcsv
    public final String c() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId
    public final boolean d() {
        return this.b.isEmpty();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelfIdentityId) {
            return fdbq.f(this.a, ((SelfIdentityId) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        final aohu aohuVarA = aoht.a((aohp) aohs.a.createBuilder());
        aohp aohpVar = aohuVarA.a;
        aohpVar.copyOnWrite();
        aohs aohsVar = (aohs) aohpVar.instance;
        aohsVar.b |= 1;
        aohsVar.c = this.a;
        final fdap fdapVar = new fdap() { // from class: aoex
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                axcm axcmVar = (axcm) obj;
                axcmVar.getClass();
                aohq aohqVar = (aohq) aohr.a.createBuilder();
                aohqVar.getClass();
                String strB = axcmVar.b();
                strB.getClass();
                aohqVar.copyOnWrite();
                ((aohr) aohqVar.instance).b = strB;
                evsn evsnVarBuild = aohqVar.build();
                evsnVarBuild.getClass();
                aohp aohpVar2 = aohuVarA.a;
                aohpVar2.copyOnWrite();
                aohs aohsVar2 = (aohs) aohpVar2.instance;
                aohs aohsVar3 = aohs.a;
                aohsVar2.d = (aohr) evsnVarBuild;
                aohsVar2.b |= 2;
                return fctx.a;
            }
        };
        this.b.ifPresent(new Consumer() { // from class: aoey
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        parcel.writeParcelable(new ProtoParsers.InternalDontUse(null, aohuVarA.a()), 0);
    }

    public /* synthetic */ SelfIdentityIdImpl(String str, Optional optional, int i, fdbk fdbkVar) {
        this(str, (i & 2) != 0 ? Optional.empty() : optional);
    }
}
