package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efjq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efjr efjrVarI = Message.i();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    efjrVarI.f(dclv.t(parcel, i));
                    break;
                case 2:
                    efjrVarI.i((RcsDestinationId) dclv.n(parcel, i, RcsDestinationId.CREATOR));
                    break;
                case 3:
                    efjrVarI.c(ekgb.n(dclv.z(parcel, i, Message.MessageContent.CREATOR)));
                    break;
                case 4:
                    efjrVarI.h((RcsDestinationId) dclv.n(parcel, i, RcsDestinationId.CREATOR));
                    break;
                case 5:
                    efjrVarI.e(ekgb.n(dclv.z(parcel, i, MessageExtensionHeader.CREATOR)));
                    break;
                case 6:
                    efjrVarI.j(efkv.a(parcel, i));
                    break;
                case 7:
                    efjrVarI.g(dclv.D(parcel, i));
                    break;
                case 8:
                    ArrayList arrayListY = dclv.y(parcel, i);
                    final Class<efjs> cls = efjs.class;
                    if (arrayListY == null) {
                        throw new dclu("Failed to read string list of ".concat(String.valueOf(efjs.class.getName())), parcel);
                    }
                    efjrVarI.d(ekhx.o((Collection) Collection.EL.stream(arrayListY).map(new Function() { // from class: efkr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            Map map;
                            String str = (String) obj;
                            Map map2 = ejvl.a;
                            str.getClass();
                            Map map3 = ejvl.a;
                            Class cls2 = cls;
                            synchronized (map3) {
                                map = (Map) map3.get(cls2);
                                if (map == null) {
                                    map = new HashMap();
                                    Iterator it = EnumSet.allOf(cls2).iterator();
                                    while (it.hasNext()) {
                                        Enum r4 = (Enum) it.next();
                                        map.put(r4.name(), new WeakReference(r4));
                                    }
                                    map3.put(cls2, map);
                                }
                            }
                            WeakReference weakReference = (WeakReference) map.get(str);
                            return weakReference == null ? ejud.a : ejwi.i((Enum) cls2.cast(weakReference.get()));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: efks
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
                            return ((ejwi) obj).g();
                        }
                    }).map(new Function() { // from class: efkt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (Enum) ((ejwi) obj).c();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toSet())));
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        return efjrVarI.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Message[i];
    }
}
