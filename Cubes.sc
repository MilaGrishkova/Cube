using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Cubes: MonoBehaviour
{

    public GameObject[] cubes = new GameObject[49];
 
    public Color[] randomColors;
    // Start is called before the first frame update
    void Start()
    {
        for(int c = 1; c < cubes.Length+1;c++)
        {
            cubes[c-1] = GameObject.Find("Cube ("+c+")");
        }

        foreach(GameObject cube in cubes)

        {
            cube.GetComponent<MeshRenderer>().material.color = randomColors[Random.Range(0, randomColors.Length - 1)];
        }
    } 

    // Update is called once per frame
    void Update()
    {
        
    }
}
