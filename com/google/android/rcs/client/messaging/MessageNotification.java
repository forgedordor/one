package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.efeu;
import defpackage.efex;
import defpackage.efmj;
import defpackage.efmp;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class MessageNotification implements Parcelable {
    public static final Parcelable.Creator<MessageNotification> CREATOR = new efex();

    public abstract Conversation a();

    public abstract efeu b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        efmp.q(parcel, 1, a(), i);
        efmp.p(parcel, 2, b(), new efmj() { // from class: efew
            @Override // defpackage.efmj
            public final void a(final Parcel parcel2, Object obj, final int i2) {
                efeu efeuVar = (efeu) obj;
                efmp.r(parcel2, 1, efeuVar.f());
                efmp.p(parcel2, 2, efeuVar.b(), new efmj() { // from class: efmd
                    @Override // defpackage.efmj
                    public final void a(Parcel parcel3, Object obj2, int i3) {
                        efmr.a(parcel3, (effi) obj2);
                    }
                }, i2);
                efmp.o(parcel2, 3, efeuVar.a().b() - 1);
                efes efesVarA = efeuVar.a();
                int iB = efesVarA.b() - 1;
                if (iB == 0) {
                    efmp.p(parcel2, 4, efesVarA.c(), new efmj() { // from class: eflx
                        @Override // defpackage.efmj
                        public final void a(Parcel parcel3, Object obj2, int i3) {
                            efdd efddVar = (efdd) obj2;
                            efmp.p(parcel3, 1, efddVar.a(), new efmj() { // from class: efle
                                @Override // defpackage.efmj
                                public final void a(Parcel parcel4, Object obj3, int i4) {
                                    efli.a(parcel4, (efdf) obj3);
                                }
                            }, i3);
                            byte[] bArrI = efddVar.b().I();
                            parcel3.writeInt(2);
                            int iDataPosition = parcel3.dataPosition();
                            parcel3.writeInt(0);
                            int iDataPosition2 = parcel3.dataPosition();
                            parcel3.writeByteArray(bArrI);
                            efmp.k(parcel3, iDataPosition, iDataPosition2);
                            efmp.l(parcel3);
                        }
                    }, i2);
                } else if (iB == 1) {
                    efmp.p(parcel2, 4, efesVarA.e(), new efmj() { // from class: efly
                        @Override // defpackage.efmj
                        public final void a(Parcel parcel3, Object obj2, int i3) {
                            efem efemVar = (efem) obj2;
                            efmp.o(parcel3, 1, efemVar.c() - 1);
                            Object obj3 = efemVar.a().get();
                            parcel3.writeInt(2);
                            int iDataPosition = parcel3.dataPosition();
                            parcel3.writeInt(0);
                            int iDataPosition2 = parcel3.dataPosition();
                            parcel3.writeLong(((Duration) obj3).getSeconds());
                            efmp.k(parcel3, iDataPosition, iDataPosition2);
                            if (efemVar.b().isPresent()) {
                                efmp.n(parcel3, 3, (Instant) efemVar.b().get());
                            }
                            efmp.l(parcel3);
                        }
                    }, i2);
                } else if (iB == 2) {
                    efmp.p(parcel2, 4, efesVarA.g(), new efmj() { // from class: efmb
                        @Override // defpackage.efmj
                        public final void a(Parcel parcel3, Object obj2, int i3) {
                            effa effaVar = (effa) obj2;
                            efmp.o(parcel3, 1, effaVar.a().ordinal());
                            efmp.r(parcel3, 2, effaVar.c());
                            efmp.n(parcel3, 3, effaVar.b());
                            efmp.r(parcel3, 4, effaVar.d());
                            efmp.l(parcel3);
                        }
                    }, i2);
                } else if (iB == 3) {
                    efmp.p(parcel2, 4, efesVarA.d(), new efmj() { // from class: eflz
                        @Override // defpackage.efmj
                        public final void a(Parcel parcel3, Object obj2, int i3) {
                            efdp efdpVar = (efdp) obj2;
                            efmp.p(parcel3, 1, efdpVar.a(), new efmj() { // from class: eflm
                                @Override // defpackage.efmj
                                public final void a(Parcel parcel4, Object obj3, int i4) {
                                    efdo efdoVar = (efdo) obj3;
                                    if (efdoVar.e().isPresent()) {
                                        efmp.r(parcel4, 1, (String) efdoVar.e().get());
                                    }
                                    efmp.o(parcel4, 2, efdoVar.a());
                                    efmp.p(parcel4, 3, efdoVar.b(), new efmj() { // from class: eflj
                                        @Override // defpackage.efmj
                                        public final void a(Parcel parcel5, Object obj4, int i5) {
                                            efli.a(parcel5, (efdf) obj4);
                                        }
                                    }, i4);
                                    efmp.r(parcel4, 4, efdoVar.f());
                                    efmp.n(parcel4, 5, efdoVar.c());
                                    efmp.l(parcel4);
                                }
                            }, i3);
                            if (efdpVar.b().isPresent()) {
                                efmp.p(parcel3, 2, efdpVar.b().get(), new efmj() { // from class: eflm
                                    @Override // defpackage.efmj
                                    public final void a(Parcel parcel4, Object obj3, int i4) {
                                        efdo efdoVar = (efdo) obj3;
                                        if (efdoVar.e().isPresent()) {
                                            efmp.r(parcel4, 1, (String) efdoVar.e().get());
                                        }
                                        efmp.o(parcel4, 2, efdoVar.a());
                                        efmp.p(parcel4, 3, efdoVar.b(), new efmj() { // from class: eflj
                                            @Override // defpackage.efmj
                                            public final void a(Parcel parcel5, Object obj4, int i5) {
                                                efli.a(parcel5, (efdf) obj4);
                                            }
                                        }, i4);
                                        efmp.r(parcel4, 4, efdoVar.f());
                                        efmp.n(parcel4, 5, efdoVar.c());
                                        efmp.l(parcel4);
                                    }
                                }, i3);
                            }
                            efmp.l(parcel3);
                        }
                    }, i2);
                } else if (iB != 4) {
                    efmp.p(parcel2, 4, efesVarA.a(), new efmj() { // from class: efmc
                        @Override // defpackage.efmj
                        public final void a(Parcel parcel3, Object obj2, int i3) {
                            efmp.r(parcel3, 1, ((efdc) obj2).a());
                            efmp.l(parcel3);
                        }
                    }, i2);
                } else {
                    efmp.p(parcel2, 4, efesVarA.f(), new efmj() { // from class: efma
                        @Override // defpackage.efmj
                        public final void a(Parcel parcel3, Object obj2, int i3) {
                            efer eferVar = (efer) obj2;
                            efmp.r(parcel3, 1, eferVar.i());
                            if (eferVar.h().isPresent()) {
                                efmp.n(parcel3, 2, (Instant) eferVar.h().get());
                            }
                            if (eferVar.d().isPresent()) {
                                efmp.n(parcel3, 3, (Instant) eferVar.d().get());
                            }
                            if (eferVar.e().isPresent()) {
                                efmp.r(parcel3, 4, (String) eferVar.e().get());
                            }
                            if (eferVar.f().isPresent()) {
                                efmp.r(parcel3, 5, (String) eferVar.f().get());
                            }
                            efmp.m(parcel3, 6, eferVar.b());
                            efmp.m(parcel3, 7, eferVar.a());
                            if (eferVar.g().isPresent()) {
                                efmp.m(parcel3, 8, ((Double) eferVar.g().get()).doubleValue());
                            }
                            if (eferVar.c().isPresent()) {
                                efmp.r(parcel3, 9, (String) eferVar.c().get());
                            }
                            efmp.l(parcel3);
                        }
                    }, i2);
                }
                if (efeuVar.d().isPresent()) {
                    efmp.p(parcel2, 5, efeuVar.d().get(), new efmj() { // from class: efmd
                        @Override // defpackage.efmj
                        public final void a(Parcel parcel3, Object obj2, int i3) {
                            efmr.a(parcel3, (effi) obj2);
                        }
                    }, i2);
                }
                if (efeuVar.e().isPresent()) {
                    efmp.n(parcel2, 7, (Instant) efeuVar.e().get());
                }
                ekgb ekgbVarC = efeuVar.c();
                final efmj efmjVar = new efmj() { // from class: efme
                    @Override // defpackage.efmj
                    public final void a(Parcel parcel3, Object obj2, int i3) {
                        efev efevVar = (efev) obj2;
                        efmp.r(parcel3, 1, efevVar.b());
                        efmp.r(parcel3, 2, efevVar.a());
                        efmp.r(parcel3, 3, efevVar.c());
                        efmp.l(parcel3);
                    }
                };
                parcel2.writeInt(6);
                int iDataPosition = parcel2.dataPosition();
                parcel2.writeInt(0);
                int iDataPosition2 = parcel2.dataPosition();
                parcel2.writeInt(ekgbVarC.size());
                Collection.EL.stream(ekgbVarC).forEach(new Consumer() { // from class: efmo
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        efmjVar.a(parcel2, obj2, i2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                efmp.k(parcel2, iDataPosition, iDataPosition2);
                efmp.l(parcel2);
            }
        }, i);
        efmp.l(parcel);
    }
}
