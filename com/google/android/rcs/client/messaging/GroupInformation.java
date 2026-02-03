package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dhiz;
import defpackage.efec;
import defpackage.efmp;
import defpackage.ekgb;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class GroupInformation implements Parcelable {
    public static final Parcelable.Creator<GroupInformation> CREATOR = new efec();

    public abstract ekgb a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    public abstract String f();

    public final String toString() {
        return String.format("GroupInformation {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", e()), String.format("subject=%s", dhiz.MESSAGE_CONTENT.c(f())), String.format("conferenceUri=%s", d()), String.format("groupMembers=%s", a()), String.format("groupRemoteCapabilities=%s", b()), String.format("subjectExtension=%s", c()))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(final Parcel parcel, final int i) {
        efmp.r(parcel, 1, e());
        efmp.r(parcel, 2, f());
        efmp.r(parcel, 3, d());
        ekgb ekgbVarA = a();
        parcel.writeInt(4);
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        int iDataPosition2 = parcel.dataPosition();
        parcel.writeInt(ekgbVarA.size());
        if (Parcelable.class.isAssignableFrom(GroupMember.class)) {
            Collection.EL.stream(ekgbVarA).forEach(new Consumer() { // from class: efml
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Parcelable parcelable = (Parcelable) obj;
                    if (parcelable != null) {
                        parcelable.writeToParcel(parcel, i);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else if (String.class.equals(GroupMember.class)) {
            Collection.EL.stream(ekgbVarA).forEach(new Consumer() { // from class: efmm
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    parcel.writeString((String) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else if (Integer.class.equals(GroupMember.class)) {
            Collection.EL.stream(ekgbVarA).forEach(new Consumer() { // from class: efmn
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Integer num = (Integer) obj;
                    if (num != null) {
                        parcel.writeInt(num.intValue());
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        efmp.k(parcel, iDataPosition, iDataPosition2);
        b().ifPresent(new Consumer() { // from class: efdz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                efmj efmjVar = new efmj() { // from class: efdy
                    @Override // defpackage.efmj
                    public final void a(Parcel parcel2, Object obj2, int i2) {
                        efmp.o(parcel2, 1, ((efel) obj2).a() ? 1 : 0);
                        efmp.l(parcel2);
                    }
                };
                efmp.p(parcel, 5, (efel) obj, efmjVar, i);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        c().ifPresent(new Consumer() { // from class: efea
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                efmj efmjVar = new efmj() { // from class: efeb
                    @Override // defpackage.efmj
                    public final void a(final Parcel parcel2, Object obj2, final int i2) {
                        efgb efgbVar = (efgb) obj2;
                        efgbVar.a().ifPresent(new Consumer() { // from class: efmt
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj3) {
                                efmj efmjVar2 = new efmj() { // from class: efms
                                    @Override // defpackage.efmj
                                    public final void a(Parcel parcel3, Object obj4, int i3) {
                                        efmr.a(parcel3, (effi) obj4);
                                    }
                                };
                                efmp.p(parcel2, 1, (effi) obj3, efmjVar2, i2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        efgbVar.b().ifPresent(new Consumer() { // from class: efmu
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj3) {
                                efmp.n(parcel2, 2, (Instant) obj3);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        efmp.l(parcel2);
                    }
                };
                efmp.p(parcel, 6, (efgb) obj, efmjVar, i);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        efmp.l(parcel);
    }
}
