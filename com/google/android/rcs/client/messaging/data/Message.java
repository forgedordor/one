package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dclw;
import defpackage.dhiz;
import defpackage.efhw;
import defpackage.efjq;
import defpackage.efjr;
import defpackage.efjs;
import defpackage.efjt;
import defpackage.efju;
import defpackage.efkv;
import defpackage.ekgb;
import defpackage.ekis;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class Message implements Parcelable {
    public static final Parcelable.Creator<Message> CREATOR = new efjq();

    /* compiled from: PG */
    public static abstract class MessageContent implements Parcelable {
        public static final Parcelable.Creator<MessageContent> CREATOR = new efjt();

        public abstract efju a();

        public abstract ChatMessage b();

        public abstract FileTransferInformation c();

        public abstract IsComposingMessage d();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public abstract LocationInformation e();

        public abstract MessageReceipt f();

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iA = dclw.a(parcel);
            efkv.c(parcel, 1, a());
            int iOrdinal = a().ordinal();
            if (iOrdinal == 0) {
                dclw.k(parcel, 2, b(), i, false);
            } else if (iOrdinal == 1) {
                dclw.k(parcel, 2, d(), i, false);
            }
            dclw.c(parcel, iA);
        }
    }

    public static efjr i() {
        efhw efhwVar = new efhw();
        efhwVar.g(false);
        return efhwVar;
    }

    public abstract RcsDestinationId a();

    public abstract ekgb b();

    public abstract ekgb c();

    public abstract Optional d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract String h();

    public final String toString() {
        String str = String.format("id=%s", h());
        dhiz dhizVar = dhiz.PHONE_NUMBER;
        return String.format("Message {%s}", TextUtils.join(",", Arrays.asList(str, String.format("sender=%s", dhizVar.c(a())), String.format("contents=%s", dhiz.MESSAGE_CONTENT.b(b())), String.format("sentTime=%s", g()), String.format("receiver=%s", dhizVar.c(f())), String.format("extensionHeaders=%s", c()), String.format("dispositionNotifications=%s", d()))));
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Iterable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, h(), false);
        dclw.k(parcel, 2, a(), i, false);
        dclw.n(parcel, 3, b(), false);
        if (f().isPresent()) {
            dclw.k(parcel, 4, f().get(), i, false);
        }
        if (g().isPresent()) {
            efkv.d(parcel, 6, (Instant) g().get());
        }
        dclw.n(parcel, 5, c(), false);
        if (e().isPresent()) {
            dclw.d(parcel, 7, ((Boolean) e().get()).booleanValue());
        }
        if (d().isPresent()) {
            ?? r6 = d().get();
            EnumSet enumSetNoneOf = EnumSet.noneOf(efjs.class);
            ekis.o(enumSetNoneOf, r6);
            dclw.D(parcel, 8, (List) Collection.EL.stream(enumSetNoneOf).map(new Function() { // from class: efku
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((Enum) obj).name();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList()));
        }
        dclw.c(parcel, iA);
    }
}
