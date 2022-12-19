package ohdodok.custom.collections.list.arraylist;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class CustomArrayListTest {

    @Test
    public void add() throws Exception {
        // given
        CustomArrayList customList = new CustomArrayList();
        ArrayList<Object> arrayList = new ArrayList<>();

        // when
        customList.add("Korea");
        arrayList.add("Korea");

        // when
        assertThat(customList.size()).isEqualTo(arrayList.size());
        assertThat(customList.get(0)).isEqualTo(arrayList.get(0));
    }

    @Test
    public void create() throws Exception {
        // given
        CustomArrayList customList = new CustomArrayList();
        ArrayList<Object> arrayList = new ArrayList<>();

        // when & when
        assertThat(customList.size()).isEqualTo(arrayList.size());
    }

}