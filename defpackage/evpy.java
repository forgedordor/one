package defpackage;

import defpackage.evpy;
import defpackage.evpz;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evpy<MessageType extends evpz<MessageType, BuilderType>, BuilderType extends evpy<MessageType, BuilderType>> implements evug {
    @Deprecated
    protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }

    private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof evur) {
                ((evur) list).d(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    resetListAndThrow(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            aaaf aaafVar = (Object) list2.get(i);
            if (aaafVar == null) {
                resetListAndThrow(list, size2);
            }
            list.add(aaafVar);
        }
    }

    private String getReadingExceptionMessage(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    protected static evvr newUninitializedMessageException(evuh evuhVar) {
        return new evvr();
    }

    private static void resetListAndThrow(List<?> list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType mo442clone();

    protected abstract BuilderType internalMergeFrom(MessageType messagetype);

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        return mergeDelimitedFrom(inputStream, evrr.a);
    }

    @Override // defpackage.evug
    public BuilderType mergeFrom(evqs evqsVar) throws evtj {
        try {
            evqz evqzVarL = evqsVar.l();
            m444mergeFrom(evqzVarL);
            evqzVarL.z(0);
            return this;
        } catch (evtj e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    @Override // defpackage.evug
    public abstract BuilderType mergeFrom(evqz evqzVar, evrr evrrVar);

    protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        evth.d(iterable);
        if (!(iterable instanceof evtq)) {
            if (iterable instanceof evup) {
                list.addAll((Collection) iterable);
                return;
            } else {
                addAllCheckingNulls(iterable, list);
                return;
            }
        }
        List listA = ((evtq) iterable).a();
        evtq evtqVar = (evtq) list;
        int size = list.size();
        for (Object obj : listA) {
            if (obj == null) {
                String str = "Element at index " + (evtqVar.size() - size) + " is null.";
                int size2 = evtqVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    evtqVar.remove(size2);
                }
            } else if (obj instanceof evqs) {
                evtqVar.b();
            } else if (obj instanceof byte[]) {
                evqs.x((byte[]) obj);
                evtqVar.b();
            } else {
                evtqVar.add((String) obj);
            }
        }
    }

    public boolean mergeDelimitedFrom(InputStream inputStream, evrr evrrVar) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        m445mergeFrom((InputStream) new evpx(inputStream, evqz.I(i, inputStream)), evrrVar);
        return true;
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType m443mergeFrom(evqs evqsVar, evrr evrrVar) throws evtj {
        try {
            evqz evqzVarL = evqsVar.l();
            mergeFrom(evqzVarL, evrrVar);
            evqzVarL.z(0);
            return this;
        } catch (evtj e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType m444mergeFrom(evqz evqzVar) {
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        return (BuilderType) mergeFrom(evqzVar, evrr.a);
    }

    @Override // defpackage.evug
    public BuilderType mergeFrom(evuh evuhVar) {
        if (getDefaultInstanceForType().getClass().isInstance(evuhVar)) {
            return (BuilderType) internalMergeFrom((evpz) evuhVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // defpackage.evug
    public BuilderType mergeFrom(InputStream inputStream) {
        evqz evqzVarK = evqz.K(inputStream);
        m444mergeFrom(evqzVarK);
        evqzVarK.z(0);
        return this;
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType m445mergeFrom(InputStream inputStream, evrr evrrVar) {
        evqz evqzVarK = evqz.K(inputStream);
        mergeFrom(evqzVarK, evrrVar);
        evqzVarK.z(0);
        return this;
    }

    @Override // defpackage.evug
    public BuilderType mergeFrom(byte[] bArr) {
        return (BuilderType) mo446mergeFrom(bArr, 0, bArr.length);
    }

    @Override // 
    /* renamed from: mergeFrom */
    public BuilderType mo446mergeFrom(byte[] bArr, int i, int i2) throws evtj {
        try {
            evqz evqzVarR = evqz.R(bArr, i, i2);
            m444mergeFrom(evqzVarR);
            evqzVarR.z(0);
            return this;
        } catch (evtj e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    @Override // 
    /* renamed from: mergeFrom */
    public BuilderType mo447mergeFrom(byte[] bArr, int i, int i2, evrr evrrVar) throws evtj {
        try {
            evqz evqzVarR = evqz.R(bArr, i, i2);
            mergeFrom(evqzVarR, evrrVar);
            evqzVarR.z(0);
            return this;
        } catch (evtj e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    @Override // defpackage.evug
    public BuilderType mergeFrom(byte[] bArr, evrr evrrVar) {
        return (BuilderType) mo447mergeFrom(bArr, 0, bArr.length, evrrVar);
    }
}
